package service;

import java.sql.SQLException;

import dto.CustomerDTO;
import exception.AuthenticationException;

public interface CustomerService {
	/**
	 * CustomerDAOImpl���� �α��ν����ִ� �޼ҵ� ȣ��
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException, AuthenticationException;
	
	/**
	 * CustomerDAOImpl���� ȸ�����Խ����ִ� �޼ҵ� ȣ��
	 * */
	int signUpCustomer(CustomerDTO customerDTO) throws SQLException;
	
	/**
	 * CustomerDAOImpl���� �̸��� �ּҿ� �̸��� �ش��ϴ� ���̵� return
	 * */
	String searchIdCustomer(String name, String email) throws SQLException;
	
	/**
	 * CustomerImpl���� �Էµ� ���̵�� �̸��� �ּҿ� �ش��ϴ� �����ִ��� Ȯ��
	 * */
	int checkIdAndEmail(String id, String email) throws SQLException;

	/**
	 * id�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean idCheck(String customerId) throws SQLException;
}
