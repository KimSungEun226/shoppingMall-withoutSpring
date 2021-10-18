package service;

import java.sql.SQLException;

import dto.OrderDTO;

public interface OrderService {

	/**
	 * OrderServiceImpl���� �ֹ��ϴ� �޼ҵ带 ȣ��
	 * */
	OrderDTO orderItems(OrderDTO order) throws SQLException;
	
	
	/**
	 * OrderServiceImpl���� �ֹ���ȣ�� �ش��ϴ� �ֹ� �����ϴ� �޼ҵ� ȣ��
	 * */
	int deleteOrder(int orderNo) throws SQLException;	
	
}
