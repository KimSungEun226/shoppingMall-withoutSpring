package dao;

import java.sql.SQLException;

import dto.SellerDTO;

public interface SellerDAO {
    
	/**
	 * �α��� ���
	 * */
	SellerDTO loginCheck(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * ȸ������ ���
	 * @return: ȸ�����Լ��� - 1, ȸ�����Խ��� - 0
	 * */
	int signUpSeller(SellerDTO sellerDTO) throws SQLException;
	
	/**
	 * ���̵� ã�� ���(�̸����ּҿ� �̸��� �ش��ϴ� id return)
	 * @return: �ش��ϴ� ���̵� �������� ���� �� null
	 * */
	String searchIdSeller(String name, String email) throws SQLException;
	
	/**
	 * ��й�ȣ ã�⸦ ���� ���� Ȯ��(�̸����ּҿ� ���̵� �ش��ϴ� seller select)
	 * @return: ������ġ - 1 , ��������ġ - 0
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;
	
	/**
	 * ���̵� �ش��ϴ� ���� ��й�ȣ ����
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * ���̵� �ߺ�üũ
	 * */
	boolean idCheck(String id);
	
	/**
	 * �̸��� �ߺ�üũ
	 * */
	boolean emailCheck(String id);
	
	/**
	 * ����ó �ߺ�üũ
	 * */
	boolean contactCheck(String id);	
	
	/**
	 * ����ó �ߺ�üũ
	 * */
	boolean businessNoCheck(int businessNo);

	int checkPwd(String id, String pwd);	
}
