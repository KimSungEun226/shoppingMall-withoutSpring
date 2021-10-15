package service;

import java.sql.SQLException;
import java.util.List;

import dao.BoardDAO;
import dao.BoardDAOImpl;
import dto.BoardDTO;


public class BoardServiceImpl implements BoardService {
	private BoardDAO boardDao = new BoardDAOImpl();
	
	@Override
	public List<BoardDTO> selectAll() throws SQLException {
		//dao를 호출...
		return boardDao.selectAll();
	}


	@Override
	public List<BoardDTO> selectAll(int pageNo) throws SQLException {
		return boardDao.getBoardList(pageNo);
	}
	
	@Override
	public BoardDTO selectByBoardNo(String boardNo, boolean flag) throws SQLException {
		if(flag) {
			if( boardDao.increamentByViews(boardNo) ==0) throw new SQLException("조회수 증가에 문제가 생겨 조회 할수 없습니다.");
		}
		
		BoardDTO board = boardDao.selectByBoardNo(boardNo);
		if(board==null)
			throw new SQLException(boardNo+"번의 공지사항을 조회할 수 없습니다.");
		
		return board;
	}
	
	@Override
	public void addBoard(BoardDTO board) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(int boardNo, int managerNo) throws SQLException {
		// TODO Auto-generated method stub

	}

	
}
