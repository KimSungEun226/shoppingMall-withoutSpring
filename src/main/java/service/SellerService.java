package service;

import java.sql.SQLException;

import dto.SellerDTO;

public interface SellerService {
	/**
	 * SellerDAOImpl���� �α��� �޼ҵ� ȣ��
	 * */
	SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * sellerDAOImpl���� ȸ�����Խ����ִ� �޼ҵ� ȣ��
	 * */
	int signUpSeller(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * sellerDAOImpl���� �̸��� �ּҿ� �̸��� �ش��ϴ� ���̵� return
	 * */
	String searchIdSeller(String name, String email) throws SQLException;
	
	/**
	 * sellerImpl���� �Էµ� ���̵�� �̸��� �ּҿ� �ش��ϴ� �����ִ��� Ȯ��
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;

	/**
	 * sellerDAOImpl���� �ش�� ���̵��� ��й�ȣ �ٲٴ� �޼ҵ�
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * id�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean idCheck(String sellerId) throws SQLException;
	
	/**
	 * email�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean emailCheck(String sellerEmail) throws SQLException;	
	
	/**
	 * contact�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean contactCheck(String sellerContact) throws SQLException;		
	
	/**
	 * businessNo�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean businessNoCheck(int sellerBusinessNo) throws SQLException;
}
