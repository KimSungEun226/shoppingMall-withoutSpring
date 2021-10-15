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
		//dao∏¶ »£√‚...
		return boardDao.selectAll();
	}

	@Override
	public List<BoardDTO> selectAll(int pageNo) throws SQLException {
		return boardDao.getBoardList(pageNo);
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
