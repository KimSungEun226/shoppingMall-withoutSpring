package dao;

import java.sql.SQLException;

import dto.CustomerDTO;

public interface CustomerDAO {
    
	/**
	 * �α��� ���
	 * @return: DB �ش��ϴ� CustomerDTO return
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * ȸ������ ���
	 * @return: ȸ�����Լ��� - 1, ȸ�����Խ��� - 0
	 * */
	int signUpCustomer(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * ���̵� ã�� ���(�̸����ּҿ� �̸��� �ش��ϴ� id return)
	 * @return: �ش��ϴ� ���̵� �������� ���� �� null
	 * */
	String searchIdCustomer(String name, String email) throws SQLException;
	
	/**
	 * ��й�ȣ ã�⸦ ���� ���� Ȯ��(�̸����ּҿ� ���̵� �ش��ϴ� customer select)
	 * @return: ������ġ - 1 , ��������ġ - 0
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;
	
	/**
	 * ���̵� �ߺ�üũ
	 * */
	boolean idCheck(String id);
}
