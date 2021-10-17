package service;

import java.io.File;
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
		if( boardDao.addBoard(board) == 0 )
			  throw new SQLException("��ϵ��� �ʾҽ��ϴ�.");

	}

	@Override
	public void updateBoard(BoardDTO board) throws SQLException {
		System.out.println(board.getBoardNo());
		//���� ��й�ȣ ��ġ���θ� �Ǵ��ϰ� ������ �����Ѵ�.
		BoardDTO dbboard = boardDao.selectByBoardNo(board.getBoardNo());
		System.out.println(dbboard);
		if(!dbboard.getPassword().equals(board.getPassword())) {
			throw new SQLException("��й�ȣ�� Ʋ���Ƿ� ������ �� �����ϴ�.");
		}
				
		if( boardDao.updateBoard(dbboard) == 0) {
			throw new SQLException("�������� �ʾҽ��ϴ�.");
		}
		
	}
	
	@Override
	public void deleteBoard(String boardNo, String password, String path) throws SQLException {
		//���� ��й�ȣ ��ġ���θ� �Ǵ��ϰ� ������ �����Ѵ�.
				BoardDTO dbBoard = boardDao.selectByBoardNo(boardNo);
				if(!dbBoard.getPassword().equals(password)) {
					throw new SQLException("��й�ȣ�� Ʋ���Ƿ� ������ �� �����ϴ�.");
				}
				
				if( boardDao.deleteBoard(boardNo, password)==0)
					throw new SQLException("�������� �ʾҽ��ϴ�.");
				
				//������ �Ϸ�Ǿ����� ������ �Խù��� ����÷�ΰ� �Ǿ��� �ڷ��� �������� ���ϵ� �������ش�.
				if(dbBoard.getFname()!=null) {
					//�������� ����
					new File(path+"/"+dbBoard.getFname()).delete();
				}

	}

	

	
}
