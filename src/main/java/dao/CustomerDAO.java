package dao;

import java.sql.SQLException;
import java.util.List;

import dto.CustomerDTO;
import dto.OrderDetailDTO;

public interface CustomerDAO {
    
	/**
	 * �α��� ���
	 * @return: DB �ش��ϴ� CustomerDTO return
	 * */
	CustomerDTO loginCheck(CustomerDTO customerDTO) throws SQLException;
	
	CustomerDTO loginCheck(String customerID) throws SQLException;
	
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
	 * ���̵� �ش��ϴ� ���� ��й�ȣ ����
	 * */
	int setPwd(String id, String pwd) throws SQLException;
	
	/**
	 * ���̵� �ߺ�üũ
	 * */
	boolean idCheck(String id) throws SQLException;
	
	/**
	 * �̸��� �ߺ�üũ
	 * */
	boolean emailCheck(String id) throws SQLException;
	
	/**
	 * ����ó �ߺ�üũ
	 * */
	boolean contactCheck(String id) throws SQLException;

	int checkPwd(String id, String pwd) throws SQLException;
	
	
	/**
	 * ȸ����ȣ �Է��ϸ� customerDTO����
	 * */
	CustomerDTO selectByCustomerNo(int customerNo) throws SQLException;
	
	/**
	 * ȸ����ȣ�� �ش��ϴ� �ֹ���� ����
	 * */
	List<OrderDetailDTO> selectOrderDetailByCustomerNo(int customerNo) throws SQLException;
}
