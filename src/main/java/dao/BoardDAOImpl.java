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
//		   //proFile�� �ܺ� ~.properites ������ �ε��Ѵ�.
//		   //proFile.load(new FileInputStream("src/dbQuery.properties"));
//		   
//		   //�� ������Ʈ ��Ÿ�ӵɶ� �� �������� ����ɶ� classes������ �������� �����ͼ� ��θ� �����ؾ��Ѵ�.
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
				BoardDTO board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						               rs.getString(4), rs.getInt(5));
				
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
				board = new BoardDTO(rs.getInt(1), rs.getString(2), rs.getString(3),
						               rs.getString(4), rs.getInt(5));
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int boardNo, int managerNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}


	


}
