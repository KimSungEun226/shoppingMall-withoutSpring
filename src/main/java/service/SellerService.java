package service;

import java.sql.SQLException;

import dto.SellerDTO;

public interface SellerService {
	/**
	 * SellerDAOImpl에서 로그인 메소드 호출
	 * */
	SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * sellerDAOImpl에서 회원가입시켜주는 메소드 호출
	 * */
	int signUpSeller(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * sellerDAOImpl에서 이메일 주소와 이름에 해당하는 아이디 return
	 * */
	String searchIdSeller(String name, String email) throws SQLException;
	
	/**
	 * sellerImpl에서 입력된 아이디와 이메일 주소에 해당하는 계정있는지 확인
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;

	/**
	 * sellerDAOImpl에서 해당된 아이디의 비밀번호 바꾸는 메소드
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * id중복체크를 위한 메소드
	 * */
	boolean idCheck(String sellerId) throws SQLException;
	
	/**
	 * email중복체크를 위한 메소드
	 * */
	boolean emailCheck(String sellerEmail) throws SQLException;	
	
	/**
	 * contact중복체크를 위한 메소드
	 * */
	boolean contactCheck(String sellerContact) throws SQLException;		
	
	/**
	 * businessNo중복체크를 위한 메소드
	 * */
	boolean businessNoCheck(int sellerBusinessNo) throws SQLException;
}
