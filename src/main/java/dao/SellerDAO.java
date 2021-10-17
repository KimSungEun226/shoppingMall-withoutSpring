package dao;

import java.sql.SQLException;

import dto.SellerDTO;

public interface SellerDAO {
    
	/**
	 * 로그인 기능
	 * */
	SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * 회원가입 기능
	 * @return: 회원가입성공 - 1, 회원가입실패 - 0
	 * */
	int signUpSeller(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * 아이디 찾기 기능(이메일주소와 이름에 해당하는 id return)
	 * @return: 해당하는 아이디 존재하지 않을 시 null
	 * */
	String searchIdSeller(String name, String email) throws SQLException;
	
	/**
	 * 비밀번호 찾기를 위한 정보 확인(이메일주소와 아이디에 해당하는 seller select)
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
	boolean idCheck(String id);
	
	/**
	 * 이메일 중복체크
	 * */
	boolean emailCheck(String id);
	
	/**
	 * 연락처 중복체크
	 * */
	boolean contactCheck(String id);	
	
	/**
	 * 연락처 중복체크
	 * */
	boolean businessNoCheck(int businessNo);

	int checkPwd(String id, String pwd);	
}
