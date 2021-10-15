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
	 * �������� ����ϴ� �޼ҵ�
	 * @return : 0 - ��� ����, 1 - ��� ���� 
	 * */
	int addBoard(BoardDTO board) throws SQLException;
	
	
	/**
	 * �������� �����ϴ� �޼ҵ�(�����ڸ� ���� ����)
	 * @return: 0 - ���� ����, 1 - ���� ����
	 * */
	int deleteBoard(int boardNo, int managerNo) throws SQLException;
	
}
