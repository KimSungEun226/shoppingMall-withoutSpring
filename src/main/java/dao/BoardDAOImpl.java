package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.BoardDTO;
import util.DbUtil;


public class BoardDAOImpl implements BoardDAO {
//	Properties proFile = new Properties();
//	   
//	   public BoardDAOImpl() {
//		   try {
//		   //proFile에 외부 ~.properites 파일을 로딩한다.
//		   //proFile.load(new FileInputStream("src/dbQuery.properties"));
//		   
//		   //현 프로젝트 런타임될때 즉 서버에서 실행될때 classes폴더를 동적으로 가져와서 경로를 설정해야한다.
//		     proFile.load(getClass().getClassLoader().getResourceAsStream("dbQuery.properties"));
//		     
//		     System.out.println("query : " + proFile.getProperty("query.select"));
//		     
//		   }catch (Exception e) {
//			e.printStackTrace();
//		  }
//	   }
	@Override
	public List<BoardDTO> selectAll() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		String sql = "select * from board";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO board = new BoardDTO(rs.getString(1), rs.getString(2), rs.getString(3),
			               rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				
				boardList.add(board);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return boardList;
	}


	@Override
	public List<BoardDTO> getBoardList(int pageNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BoardDTO selectByBoardNo(String boardNo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		BoardDTO board=null;
		String sql = "select * from board where BOARD_NO=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardNo);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				board = new BoardDTO(rs.getString(1), rs.getString(2), rs.getString(3),
						               rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return board;
	}


	@Override
	public int increamentByViews(String boardNo) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		String sql = "update board set BOARD_VIEWS=BOARD_VIEWS+1 where BOARD_NO=?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardNo);
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	
	@Override
	public int addBoard(BoardDTO board) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		String sql = "insert into board values(BOARD_NO.NEXTVAL,?,?,sysdate,0,?,?,?)";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBoardName());
			ps.setString(2, board.getBoardContent());
			ps.setString(3, board.getPassword());
			ps.setString(4, board.getFname());
			ps.setInt(5, board.getFsize());
			
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		
		return result;
	}

	@Override
	public int updateBoard(BoardDTO board) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		System.out.println("update Dao");
		System.out.println(board.getBoardName());
		System.out.println(board.getBoardContent());
		System.out.println(board.getBoardNo());
		System.out.println(board.getPassword());
		String sql = "update board set board_name=?,board_content=? where board_no=? and board_password=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, board.getBoardName());
			ps.setString(2, board.getBoardContent());
			ps.setString(3, board.getBoardNo());
			ps.setString(4, board.getPassword());
			
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	
	@Override
	public int deleteBoard(String boardNo, String password) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		String sql = "delete board where board_no=? and board_password=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, boardNo);
			ps.setString(2, password);
			
			result = ps.executeUpdate();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

}
