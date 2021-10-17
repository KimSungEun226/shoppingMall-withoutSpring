package service;

import java.sql.SQLException;
import java.util.List;

import dao.CartDAO;
import dao.CartDAOImpl;
import dto.CartDTO;

public class CartServiceImpl implements CartService {

	@Override
	public int addToCart(CartDTO cart) throws SQLException {
		// TODO Auto-generated method stub
        return 0;
	}

	@Override
	public int deleteFromCart(int cartNo) throws SQLException {
		CartDAO dao = new CartDAOImpl();
        int result = dao.deleteFromCart(cartNo);
        
        return result;
	}

	@Override
	public List<CartDTO> selectCartByCustomerNo(int customerNo) throws SQLException {
		CartDAO dao = new CartDAOImpl();
		
		List<CartDTO> cartList = dao.selectCartByCustomerNo(customerNo);
		return cartList;
	}

}
