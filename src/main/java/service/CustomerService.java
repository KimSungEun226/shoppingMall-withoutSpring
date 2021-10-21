package service;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerDTO;
import dto.OrderDetailDTO;
import exception.AuthenticationException;

public interface CustomerService {
	/**
	 * CustomerDAOImpl에서 로그인시켜주는 메소드 호출
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;

	
	/**
	 * CustomerDAOImpl에서 네이버 아이디로 로그인 시켜주는 메소드 호출
	 * */
	CustomerDTO loginCheck(String customerID) throws SQLException;	
	
	/**
	 * CustomerDAOImpl에서 회원가입시켜주는 메소드 호출
	 * */
	int signUpCustomer(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * CustomerDAOImpl에서 이메일 주소와 이름에 해당하는 아이디 return
	 * */
	String searchIdCustomer(String name, String email) throws SQLException;
	
	/**
	 * CustomerImpl에서 입력된 아이디와 이메일 주소에 해당하는 계정있는지 확인
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;

	/**
	 * CustomerDAOImpl에서 해당된 아이디의 비밀번호 바꾸는 메소드
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * id중복체크를 위한 메소드
	 * */
	boolean idCheck(String customerId) throws SQLException;
	
	/**
	 * email중복체크를 위한 메소드
	 * */
	boolean emailCheck(String customerEmail) throws SQLException;	
	
	/**
	 * contact중복체크를 위한 메소드
	 * */
	boolean contactCheck(String customerContact) throws SQLException;

	int checkPwd(String id, String pwd) throws SQLException;
	
	List<OrderDetailDTO> selectOrderDetailByCustomerNo(int customerNo) throws SQLException;
	
	
	CustomerDTO selectByCustomerNo(int customerNo) throws SQLException;
	
}
