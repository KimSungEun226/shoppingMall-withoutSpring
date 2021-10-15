package service;

import java.sql.SQLException;
import java.util.List;

import dto.BoardDTO;

public interface BoardService {
	/**
	 * ���������� ��� ���ڵ� �˻��ϴ� �޼ҵ� ȣ��
	 * */
    List<BoardDTO> selectAll() throws SQLException;
    
    /**
	 * pagingó��
	 * */
    List<BoardDTO> selectAll(int pageNo) throws SQLException;
    
	/**
	 * BoardImpl�� ���������� �����ϴ� �޼ҵ� ȣ��
	 * */
    void addBoard(BoardDTO board) throws SQLException;
	
	
	/**
	 * BoardImpl�� ���������� �����ϴ� �޼ҵ� ȣ��
	 * */
	void deleteBoard(int boardNo, int managerNo) throws SQLException;
	
}
