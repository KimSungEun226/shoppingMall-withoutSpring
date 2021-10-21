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
			con.setAutoCommit(false); // �ڵ�Ŀ������
			ps = con.prepareStatement(sql);
			ps.setInt(1, order.getCustomerNo());
			ps.setString(2, order.getOrderAddr());
			ps.setInt(3, order.getOrderTotalPrice());
			result = ps.executeUpdate();
						
			if (result > 0) {
				//��ٱ��Ͽ��� ��ϵ��� �����Ѵ�.
				delResult = deleteFromCart(con, order.getCustomerNo());
				//�����Ѱ� ������ �ֹ��� ����� �̷������ �ʰ� �ǹǷ� �ѹ�����ش�.
				if(delResult ==0) {
					con.rollback();
					throw new SQLException("�ֹ��� �����߽��ϴ�.(��ٱ��Ͽ��� ���� ����)");
				}
				
				//�߰��� order�� �����ϱ� ���� �����´�.
				dbDTO = selectOrderRecent(con);
				if (dbDTO==null) {
					con.rollback();
					throw new SQLException("�ֹ��� �����߽��ϴ�.,,,,");
				}
				
				//���� orderDetail���� ���̺� �־�����.
				for (CartDTO cart: cartList) {
					int temp_result = 0;
					OrderDetailDTO orderDetail = new OrderDetailDTO(cart.getItemNo(), dbDTO.getOrderNo(), cart.getCartItemCount());
					temp_result = addOrderDetail(orderDetail, con);
					if(temp_result == 0) {
						con.rollback();
						throw new SQLException("�ֹ��� �����߽��ϴ�...(orderDetail�ֱ� ����");
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
    
	//ȸ����ȣ�� �ش��ϴ� īƮ��� ���� �����Ѵ�.
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
	
	//�ٷ� �߰��� Order�� �����´�.
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
    
	
	
	
	//orderDetail������ insert�����ִ�
	public int addOrderDetail(OrderDetailDTO orderDetail, Connection con) throws SQLException {
		PreparedStatement ps = null;
		int result = 0;
		String sql = "insert into order_detail values(ORDER_DETAIL_NO_SEQ.nextval, ?, ?, ?, sysdate, '�����')";
		
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
