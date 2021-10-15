package dao;

import java.sql.SQLException;
import java.util.List;

import dto.BoardDTO;

public interface BoardDAO {
	 /**
	  * 공지사항 전체 검색
	  * */
	  List<BoardDTO> selectAll() throws SQLException;
	  
	 /**
	  * 공지사항 전체 검색(페이지처리)
	  * */
	   List<BoardDTO> getBoardList(int pageNo) throws SQLException;

	/**
	 * 공지사항 등록하는 메소드
	 * @return : 0 - 등록 실패, 1 - 등록 성공 
	 * */
	int addBoard(BoardDTO board) throws SQLException;
	
	
	/**
	 * 공지사항 삭제하는 메소드(관리자만 삭제 가능)
	 * @return: 0 - 삭제 실패, 1 - 삭제 성공
	 * */
	int deleteBoard(int boardNo, int managerNo) throws SQLException;
	
}
