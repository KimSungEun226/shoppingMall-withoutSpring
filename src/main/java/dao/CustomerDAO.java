package dao;

import java.sql.SQLException;

import dto.CustomerDTO;

public interface CustomerDAO {
    
	/**
	 * 로그인 기능
	 * @return: DB 해당하는 CustomerDTO return
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * 회원가입 기능
	 * @return: 회원가입성공 - 1, 회원가입실패 - 0
	 * */
	int signUpCustomer(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * 아이디 찾기 기능(이메일주소와 이름에 해당하는 id return)
	 * @return: 해당하는 아이디 존재하지 않을 시 null
	 * */
	String searchIdCustomer(String name, String email) throws SQLException;
	
	/**
	 * 비밀번호 찾기를 위한 정보 확인(이메일주소와 아이디에 해당하는 customer select)
	 * @return: 정보일치 - 1 , 정보불일치 - 0
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;
	
	/**
	 * 아이디 중복체크
	 * */
	boolean idCheck(String id);
}
