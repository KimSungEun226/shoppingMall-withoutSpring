package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;


public interface CartDAO {
    
	/**
     * ��ٱ��Ͽ� �߰��ϴ� �޼ҵ�
     * @return: 0 - �߰� ����, 1 - �߰� ����
     * */
	int addToCart(CartDTO cartDTO) throws SQLException;
	
	/**
	 * ��ٱ��Ͽ� ������ ���� �����ϱ�
	 * @return: 0 - ���� ����, 1 - ���� ���� 
	 * */
	int updateCart(int cartItemCount, int cartNo, int customerNo) throws SQLException;

	
	/**
	 * ��ٱ��Ϲ�ȣ�� �ش��ϴ� ��ٱ��� �����ϴ� �޼ҵ�
	 * @return: 0 - ���� ����, 1 - ���� ����
	 * */
	int deleteFromCart(int cartNo) throws SQLException;
	
	/**
	 * ȸ����ȣ�� �ش��ϴ� ��ٱ��� list�� return�ϴ� �޼ҵ�
	 * @return: List<CartDTO>
	 * */
	List<CartDTO> selectCartByCustomerNo(int customerNo) throws SQLException;
	

}
