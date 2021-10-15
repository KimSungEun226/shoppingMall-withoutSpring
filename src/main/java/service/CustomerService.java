package service;

import java.sql.SQLException;

import dto.CustomerDTO;
import exception.AuthenticationException;

public interface CustomerService {
	/**
	 * CustomerDAOImpl에서 로그인시켜주는 메소드 호출
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException, AuthenticationException;
	
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
	 * id중복체크를 위한 메소드
	 * */
	boolean idCheck(String customerId) throws SQLException;
}
