package service;

import java.sql.SQLException;
import java.util.List;

import dto.BoardDTO;

public interface BoardService {
	/**
	 * 공지사항의 모든 레코드 검색하는 메소드 호출
	 * */
    List<BoardDTO> selectAll() throws SQLException;
    
    /**
	 * paging처리
	 * */
    List<BoardDTO> selectAll(int pageNo) throws SQLException;
    
    /**
     * 공지사항 상세보기
     */
    BoardDTO selectByBoardNo(String boardNo, boolean flag) throws SQLException;
    
	/**
	 * BoardImpl의 공지사항을 생성하는 메소드 호출
	 * */
    void addBoard(BoardDTO board) throws SQLException;
	
	
	/**
	 * BoardImpl의 공지사항을 삭제하는 메소드 호출
	 * */
	void deleteBoard(int boardNo, int managerNo) throws SQLException;
	
}
