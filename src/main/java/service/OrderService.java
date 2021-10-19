package service;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;
import dto.OrderDTO;

public interface OrderService {

	/**
	 * OrderServiceImpl���� �ֹ��ϴ� �޼ҵ带 ȣ��
	 * */
	int orderItems(OrderDTO order, List<CartDTO> list) throws SQLException;
	
	
	/**
	 * OrderServiceImpl���� �ֹ���ȣ�� �ش��ϴ� �ֹ� �����ϴ� �޼ҵ� ȣ��
	 * */
	int deleteOrder(int orderNo) throws SQLException;	
	
	
	
	
}
