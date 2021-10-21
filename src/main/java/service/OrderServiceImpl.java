package service;

import java.sql.SQLException;
import java.util.List;

import dao.ItemDAO;
import dao.ItemDAOImpl;
import dao.OrderDAO;
import dao.OrderDAOImpl;
import dto.CartDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import dto.OrderDetailView;

public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDao = new OrderDAOImpl();
	
	@Override
	public int orderItems(OrderDTO order, List<CartDTO> list) throws SQLException {
		OrderDAO dao = new OrderDAOImpl();
		int result = dao.orderItem(order, list);
        return result;
	}

	@Override
	public int deleteOrder(int orderNo) throws SQLException {
		// TODO Auto-generated method stub
        return 0;
	}

	
	@Override
	public List<OrderDetailView> selectOrderDetailByItemNo(int itemNo) throws SQLException {
		List<OrderDetailView> orderDetailList = orderDao.selectOrderDetailByItemNo(itemNo);
		System.out.println("service 출력. 갯수: " + orderDetailList.size());
		if(orderDetailList==null) throw new SQLException(itemNo+"번 상품의 주문 내역이 없습니다. ");
		return orderDetailList;
	}



}
