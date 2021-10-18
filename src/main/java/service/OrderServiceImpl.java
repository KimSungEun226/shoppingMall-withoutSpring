package service;

import java.sql.SQLException;

import dao.OrderDAO;
import dao.OrderDAOImpl;
import dto.OrderDTO;

public class OrderServiceImpl implements OrderService {

	@Override
	public OrderDTO orderItems(OrderDTO order) throws SQLException {
		OrderDAO dao = new OrderDAOImpl();
		OrderDTO result = dao.orderItem(order);
        return result;
	}

	@Override
	public int deleteOrder(int orderNo) throws SQLException {
		// TODO Auto-generated method stub
        return 0;
	}

}
