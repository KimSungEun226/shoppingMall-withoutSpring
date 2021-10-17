package service;

import java.sql.SQLException;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import dto.CustomerDTO;
import exception.AuthenticationException;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException, AuthenticationException {
		CustomerDAO dao = new CustomerDAOImpl();
		CustomerDTO dto = dao.loginCheck(customerDTO);
		
    	return dto;
	}

	@Override
	public int signUpCustomer(CustomerDTO customerDTO) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		int result = dao.signUpCustomer(customerDTO);
		
		return result;
	}



	@Override
	public String searchIdCustomer(String name, String email) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		String result = dao.searchIdCustomer(name, email);
		return result;
	}

	@Override
	public int checkIdAndEmail(String id, String email) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		int result = dao.checkIdAndEmail(id, email);
		return result;
	}

	@Override
	public int setPwd(String id, String pwd) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		int result = dao.setPwd(id, pwd);
		return result;
	}

	@Override
	public boolean idCheck(String customerId) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.idCheck(customerId);
		return result;
	}
	
	@Override
	public boolean emailCheck(String customerEmail) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.emailCheck(customerEmail);
		return result;
	}

	@Override
	public boolean contactCheck(String customerContact) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.contactCheck(customerContact);
		return result;
	}

	@Override
	public int checkPwd(String id, String pwd) throws SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		int result = dao.checkPwd(id, pwd);
		return result;
	}
}
