package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;

public interface OrderDAO {
    
	/**
	 * 주문하는 메소드
	 * @return: 0 - 주문 실패, 1 - 주문 성공
	 * */
	int orderItem(OrderDTO order, List<CartDTO> cartList) throws SQLException;
	
	
	/**
	 * 주문번호에 해당하는 주문 삭제하는 메소드
	 * @return: 0 - 삭제 실패, 1 - 삭제 성공
	 * */
	int deleteOrder(int orderNo) throws SQLException;
	
	
	/**
	 * 아이템 번호에 해당하는 주문 상세 리스트를 가져오는 메소드 (판매자 전용) 
	 * */
	List<OrderDetailDTO> selectOrderDetailByItemNo(int itemNo) throws SQLException;
	
	
	/**
	 * 아이템 번호에 해당하는 주문 리스트를 가져오는 메소드 (판매자 전용) 
	 * */
	List<OrderDTO> selectOrderByItemNo(int itemNo) throws SQLException;
}
