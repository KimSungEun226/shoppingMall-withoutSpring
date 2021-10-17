package service;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;

public interface CartService {
	/**
     * CartDAOImpl���� ��ٱ��Ͽ� �߰��ϴ� �޼ҵ�ȣ��
     * */
	int addToCart(CartDTO cart) throws SQLException;
	
	/**
	 * CartDAOImpl���� ��ٱ��Ϲ�ȣ�� �ش��ϴ� ��ٱ��� �����ϴ� �޼ҵ�ȣ��
	 * */
	int deleteFromCart(int cartNo) throws SQLException;
	
	/**
	 * CartDAOImpl���� ȸ����ȣ�� �ش��ϴ� ��ٱ��� list�� return�ϴ� �޼ҵ�ȣ��
	 * */
	List<CartDTO> selectCartByCustomerNo(int customerNo) throws SQLException;
}
