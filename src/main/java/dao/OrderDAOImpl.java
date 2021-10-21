package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import util.DbUtil;

public class OrderDAOImpl implements OrderDAO {
    
	@Override
	public int orderItem(OrderDTO order, List<CartDTO> cartList) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		int result = 0;
		int delResult = 0;
		int lastResult = 0;
		OrderDTO dbDTO=null;
		String sql = "insert into order_item values(ORDER_NO_SEQ.nextval, ?, ?, ?)";
		try {
			con = DbUtil.getConnection();
			con.setAutoCommit(false); // 자동커밋해지
			ps = con.prepareStatement(sql);
			ps.setInt(1, order.getCustomerNo());
			ps.setString(2, order.getOrderAddr());
			ps.setInt(3, order.getOrderTotalPrice());
			result = ps.executeUpdate();
						
			if (result > 0) {
				//장바구니에서 목록들을 삭제한다.
				delResult = deleteFromCart(con, order.getCustomerNo());
				//삭제한게 없으면 주문이 제대로 이루어지지 않게 되므로 롤백시켜준다.
				if(delResult ==0) {
					con.rollback();
					throw new SQLException("주문이 실패했습니다.(장바구니에서 삭제 실패)");
				}
				
				//추가된 order를 리턴하기 위해 가져온다.
				dbDTO = selectOrderRecent(con);
				if (dbDTO==null) {
					con.rollback();
					throw new SQLException("주문이 실패했습니다.,,,,");
				}
				
				//이제 orderDetail들을 테이블에 넣어주자.
				for (CartDTO cart: cartList) {
					int temp_result = 0;
					OrderDetailDTO orderDetail = new OrderDetailDTO(cart.getItemNo(), dbDTO.getOrderNo(), cart.getCartItemCount());
					temp_result = addOrderDetail(orderDetail, con);
					if(temp_result == 0) {
						con.rollback();
						throw new SQLException("주문이 실패했습니다...(orderDetail넣기 실패");
					}
				}
				lastResult = 1;
			}
			
		}finally {
			con.commit();
			DbUtil.dbClose(ps, con);
		}
		return lastResult;
	}
    
	//회원번호에 해당하는 카트목록 전부 삭제한다.
	public int deleteFromCart(Connection con, int customerNo) throws SQLException {
		PreparedStatement ps =null;
		int result = 0;
		String sql = "delete from cart where customer_no=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, customerNo);
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(ps, null);
		}
		
		return result;
	}	
	
	//바로 추가된 Order를 가져온다.
	public OrderDTO selectOrderRecent(Connection con) throws SQLException {
		PreparedStatement ps =null;
		ResultSet rs =null;
		OrderDTO result =null;
		String sql = "select * from order_item order by order_no desc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				result = new OrderDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
			}
			
		}finally {
			DbUtil.dbClose(rs, ps, null);
		}
		
		return result;
	}	
	
	@Override
	public int deleteOrder(int orderNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
    
	
	
	
	//orderDetail받으면 insert시켜주는
	public int addOrderDetail(OrderDetailDTO orderDetail, Connection con) throws SQLException {
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into order_detail values(ORDER_DETAIL_NO_SEQ.nextval, ?, ?, ?, sysdate, '배송중')";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, orderDetail.getItemNo());
			ps.setInt(2, orderDetail.getOrderNo());
			ps.setInt(3, orderDetail.getOrderItemCount());
			result = ps.executeUpdate();		
		}finally {
			DbUtil.dbClose(ps,null);
		}
		
		return result;
	}


}
