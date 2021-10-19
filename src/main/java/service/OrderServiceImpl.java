package service;

import java.sql.SQLException;
import java.util.List;

import dao.OrderDAO;
import dao.OrderDAOImpl;
import dto.CartDTO;
import dto.OrderDTO;

public class OrderServiceImpl implements OrderService {

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

}
