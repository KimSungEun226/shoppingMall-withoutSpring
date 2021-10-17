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
		if( boardDao.addBoard(board) == 0 )
			  throw new SQLException("등록되지 않았습니다.");

	}

	@Override
	public void updateBoard(BoardDTO board) throws SQLException {
		System.out.println(board.getBoardNo());
		//먼저 비밀번호 일치여부를 판단하고 같으면 수정한다.
		BoardDTO dbboard = boardDao.selectByBoardNo(board.getBoardNo());
		System.out.println(dbboard);
		if(!dbboard.getPassword().equals(board.getPassword())) {
			throw new SQLException("비밀번호가 틀리므로 수정할 수 없습니다.");
		}
				
		if( boardDao.updateBoard(dbboard) == 0) {
			throw new SQLException("수정되지 않았습니다.");
		}
		
	}
	
	@Override
	public void deleteBoard(String boardNo, String password, String path) throws SQLException {
		//먼저 비밀번호 일치여부를 판단하고 같으면 수정한다.
				BoardDTO dbBoard = boardDao.selectByBoardNo(boardNo);
				if(!dbBoard.getPassword().equals(password)) {
					throw new SQLException("비밀번호가 틀리므로 삭제할 수 없습니다.");
				}
				
				if( boardDao.deleteBoard(boardNo, password)==0)
					throw new SQLException("삭제되지 않았습니다.");
				
				//삭제가 완료되었을때 삭제된 게시물이 파일첨부가 되었던 자료라면 폴더에서 파일도 삭제해준다.
				if(dbBoard.getFname()!=null) {
					//폴더에서 삭제
					new File(path+"/"+dbBoard.getFname()).delete();
				}

	}

	

	
}
