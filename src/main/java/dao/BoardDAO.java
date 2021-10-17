package dao;

import java.sql.SQLException;
import java.util.List;

import dto.BoardDTO;

public interface BoardDAO {

	/**
	 * �������� ��ü �˻�
	 * */
	 List<BoardDTO> selectAll() throws SQLException;
	  
	/**
	 * �������� ��ü �˻�(������ó��)
	 * */
	 List<BoardDTO> getBoardList(int pageNo) throws SQLException;
	   
	/**
	 * �������� ��ȣ�� �ش��ϴ� ���ڵ� �˻�
	 */
	 BoardDTO selectByBoardNo(String boardNo) throws SQLException;
	   
	/**
	 * �������� ��ȸ�� �����ϴ� ���
	 */
	 int increamentByViews(String boardNo) throws SQLException;
	 
	/**
	 * �������� ����ϴ� �޼ҵ�
	 * @return : 0 - ��� ����, 1 - ��� ���� 
	 * */
	int addBoard(BoardDTO board) throws SQLException;
	
	/**
	 * �������� ��ȣ�� �ش��ϴ� ���ڵ� ����
	 * @return : 1-�������� , 0 - ��������
	 * */
	int updateBoard(BoardDTO board) throws SQLException;
	
	/**
	 * �������� �����ϴ� �޼ҵ�(�����ڸ� ���� ����)
	 * @return: 0 - ���� ����, 1 - ���� ����
	 * */
	int deleteBoard(String boardNo, String password) throws SQLException;
	
}
