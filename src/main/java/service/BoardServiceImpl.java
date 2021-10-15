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
		//dao�� ȣ��...
		return boardDao.selectAll();
	}


	@Override
	public List<BoardDTO> selectAll(int pageNo) throws SQLException {
		return boardDao.getBoardList(pageNo);
	}
	
	@Override
	public BoardDTO selectByBoardNo(String boardNo, boolean flag) throws SQLException {
		if(flag) {
			if( boardDao.increamentByViews(boardNo) ==0) throw new SQLException("��ȸ�� ������ ������ ���� ��ȸ �Ҽ� �����ϴ�.");
		}
		
		BoardDTO board = boardDao.selectByBoardNo(boardNo);
		if(board==null)
			throw new SQLException(boardNo+"���� ���������� ��ȸ�� �� �����ϴ�.");
		
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
