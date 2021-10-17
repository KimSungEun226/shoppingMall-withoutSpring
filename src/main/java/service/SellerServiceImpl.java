package service;

import java.sql.SQLException;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import dao.SellerDAO;
import dao.SellerDAOImpl;
import dto.SellerDTO;

public class SellerServiceImpl implements SellerService {

	@Override
	public SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		SellerDTO dto = dao.loginCheck(sellerDTO);
		
    	return dto;
	}

	@Override
	public int signUpSeller(SellerDTO sellerDTO) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		int result = dao.signUpSeller(sellerDTO);
		
		return result;
	}

	@Override
	public String searchIdSeller(String name, String email) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		String result = dao.searchIdSeller(name, email);
		return result;
	}

	@Override
	public int checkIdAndEmail(String id, String email) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		int result = dao.checkIdAndEmail(id, email);
		return result;
	}

	@Override
	public int setPwd(String id, String pwd) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		int result = dao.setPwd(id, pwd);
		return result;
	}

	@Override
	public boolean idCheck(String sellerId) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		boolean result = dao.idCheck(sellerId);
		return result;
	}
	
	@Override
	public boolean emailCheck(String sellerEmail) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		boolean result = dao.emailCheck(sellerEmail);
		return result;
	}

	@Override
	public boolean contactCheck(String sellerContact) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		boolean result = dao.contactCheck(sellerContact);
		return result;
	}

	@Override
	public boolean businessNoCheck(int sellerBusinessNo) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		boolean result = dao.businessNoCheck(sellerBusinessNo);
		return result;
	}

	@Override
	public int checkPwd(String id, String pwd) throws SQLException {
		SellerDAO dao = new SellerDAOImpl();
		int result = dao.checkPwd(id, pwd);
		return result;
	}

}
