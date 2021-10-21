package service;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerDTO;
import dto.OrderDetailDTO;
import exception.AuthenticationException;

public interface CustomerService {
	/**
	 * CustomerDAOImpl���� �α��ν����ִ� �޼ҵ� ȣ��
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;

	
	/**
	 * CustomerDAOImpl���� ���̹� ���̵�� �α��� �����ִ� �޼ҵ� ȣ��
	 * */
	CustomerDTO loginCheck(String customerID) throws SQLException;	
	
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
	 * CustomerDAOImpl���� �ش�� ���̵��� ��й�ȣ �ٲٴ� �޼ҵ�
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * id�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean idCheck(String customerId) throws SQLException;
	
	/**
	 * email�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean emailCheck(String customerEmail) throws SQLException;	
	
	/**
	 * contact�ߺ�üũ�� ���� �޼ҵ�
	 * */
	boolean contactCheck(String customerContact) throws SQLException;

	int checkPwd(String id, String pwd) throws SQLException;
	
	List<OrderDetailDTO> selectOrderDetailByCustomerNo(int customerNo) throws SQLException;
	
	
	CustomerDTO selectByCustomerNo(int customerNo) throws SQLException;
	
}
