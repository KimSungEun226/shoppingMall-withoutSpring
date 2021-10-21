package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerDTO;
import dto.OrderDetailDTO;

public interface CustomerDAO {
    
	/**
	 * 로그인 기능
	 * @return: DB 해당하는 CustomerDTO return
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;
	
	CustomerDTO loginCheck(String customerID) throws SQLException;
	
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
	 * 아이디에 해당하는 계정 비밀번호 변경
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * 아이디 중복체크
	 * */
	boolean idCheck(String id) throws SQLException;
	
	/**
	 * 이메일 중복체크
	 * */
	boolean emailCheck(String id) throws SQLException;
	
	/**
	 * 연락처 중복체크
	 * */
	boolean contactCheck(String id) throws SQLException;

	int checkPwd(String id, String pwd) throws SQLException;
	
	
	/**
	 * 회원번호 입력하면 customerDTO리턴
	 * */
	CustomerDTO selectByCustomerNo(int customerNo) throws SQLException;
	
	/**
	 * 회원번호에 해당하는 주문목록 리턴
	 * */
	List<OrderDetailDTO> selectOrderDetailByCustomerNo(int customerNo) throws SQLException;
}
