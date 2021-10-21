package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;

public interface OrderDAO {
    
	/**
	 * �ֹ��ϴ� �޼ҵ�
	 * @return: 0 - �ֹ� ����, 1 - �ֹ� ����
	 * */
	int orderItem(OrderDTO order, List<CartDTO> cartList) throws SQLException;
	
	
	/**
	 * �ֹ���ȣ�� �ش��ϴ� �ֹ� �����ϴ� �޼ҵ�
	 * @return: 0 - ���� ����, 1 - ���� ����
	 * */
	int deleteOrder(int orderNo) throws SQLException;
	
	
	/**
	 * ������ ��ȣ�� �ش��ϴ� �ֹ� �� ����Ʈ�� �������� �޼ҵ� (�Ǹ��� ����) 
	 * */
	List<OrderDetailDTO> selectOrderDetailByItemNo(int itemNo) throws SQLException;
	
	
	/**
	 * ������ ��ȣ�� �ش��ϴ� �ֹ� ����Ʈ�� �������� �޼ҵ� (�Ǹ��� ����) 
	 * */
	List<OrderDTO> selectOrderByItemNo(int itemNo) throws SQLException;
}
