package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CartDTO;


public interface CartDAO {
    
	/**
     * 장바구니에 추가하는 메소드
     * @return: 0 - 추가 실패, 1 - 추가 성공
     * */
	int addToCart(CartDTO cartDTO) throws SQLException;
	
	/**
	 * 장바구니에 아이템 수량 수정하기
	 * @return: 0 - 수정 실패, 1 - 수정 성공 
	 * */
	int updateCart(int cartItemCount, int cartNo, int customerNo) throws SQLException;

	
	/**
	 * 장바구니번호에 해당하는 장바구니 삭제하는 메소드
	 * @return: 0 - 삭제 실패, 1 - 삭제 성공
	 * */
	int deleteFromCart(int cartNo) throws SQLException;
	
	/**
	 * 회원번호에 해당하는 장바구니 list를 return하는 메소드
	 * @return: List<CartDTO>
	 * */
	List<CartDTO> selectCartByCustomerNo(int customerNo) throws SQLException;
	

}
