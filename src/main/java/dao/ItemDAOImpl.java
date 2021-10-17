package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ItemDTO;
import dto.ReviewDTO;
import paging.PageCnt;
import util.DbUtil;

public class ItemDAOImpl implements ItemDAO {

	
	Properties proFile = new Properties();
	
	public ItemDAOImpl() {
		try {
			
			 //proFile에 외부 ~.properites 파일을 로딩한다.
			   //proFile.load(new FileInputStream("src/dbQuery.properties"));
			   
			   //현 프로젝트 런타임될때 즉 서버에서 실행될때 classes폴더를 동적으로 가져와서 경로를 설정해야한다.
			
			  proFile.load(getClass().getClassLoader().getResourceAsStream("itemQuery.Properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	/**
	 * 상품 전체 검색
	 **/
	@Override
	public List<ItemDTO> selectAll() throws SQLException {
		Connection con = null;
 		PreparedStatement ps = null;
 		ResultSet rs =null;
 		List<ItemDTO>itemlist = new ArrayList<>();
 		String sql = proFile.getProperty("item.selectAll");
 		try {
 			con = DbUtil.getConnection();
 			ps = con.prepareStatement(sql);
 			rs = ps.executeQuery();
 			while(rs.next()) {
 				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				
				itemlist.add(itemDTO);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return itemlist;
	}
 				 
 	/**
 	 * 레코드 전체 검색(페이지처리)			
 	 **/
	@Override
	public List<ItemDTO>getBoardList(int pageNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<ItemDTO>pageList = new ArrayList<ItemDTO>();
		String sql = proFile.getProperty("item.getBoardList");
		
		
		try {
			//전체 레코드 수 구하기
			int totalCount = this.getSelectTotalCount(); //전체게시물 개수 가져오기
			//totalCount = 전체 게시물 개수
			int totalPage = totalCount%PageCnt.pagesize==0 ? totalCount/PageCnt.pagesize : (totalCount/PageCnt.pagesize)+1;
			
			//전체 게시물 개수%
			
			//% == 나누고 난 나머지
			
			//조건? true : false
			//int totalPage = 조건? : 조건이 true일때 : 조건이 false일때 
			
			//조건: 전체게시물 개수 % 한 페이지당 출력될 게시물 수 ==0 ? 총 페이지 수는(전체 게시물 개수/한 페이지당 게시물 수) : 총 페이지 수는(전체 게시물 개수/한 페이지당 게시물 수)+1�
			//17개인데 8개씩 출력하면 1개 게시물이 남으니까 1페이지를 더 늘리겠다. 
			
			
			//총 페이지수 구하기
			PageCnt pageCnt = new PageCnt(); // 객체를 하나 생성함.
			
			pageCnt.setPageCnt( totalPage ) ; //this.pageCnt(총 페이지 수)
			//
			pageCnt.setPageNo(pageNo);//사용자가 클릭한 page번호로 설정한다.     
			//현재 페이지번호 == pageNo로 정의하겠다.
			
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 2개
			
			ps.setInt(1, pageNo*PageCnt.pagesize); //최대 6 *5
			ps.setInt(2, (pageNo-1)*PageCnt.pagesize +1); //최소 (6-1)*5+1
			
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				
				pageList.add(itemDTO);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return pageList;
	}
		
	/**
	 * 전체게시물 개수 가져오기 
	 * 
	 **/
	private int getSelectTotalCount() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
	    int result=0;
		String sql = proFile.getProperty("item.totalCount"); //
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {  //rs.next() 가 값이 있을 때 (== rs.next()이 존재할 때 if  사용 // item 갯수가 존재한다면, 
			   result = rs.getInt(1); // 그 item 갯수를 result로 받는다. 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return result;  // item 갯수를 반환한다. count(*)  -> count(갯수를 세는 함수)
	}
	

	/**
	 * 카테고리에 해당하는 상품 검색 
	 **/
	@Override
	public List<ItemDTO> selectByCategoryNo(int categoryNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		ResultSet rs= null;
		List<ItemDTO> categoryList = new ArrayList<ItemDTO>();
		String sql = proFile.getProperty("item.selectByCategoryNo"); 
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(2, categoryNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				categoryList.add(itemDTO);
			}
		} finally {
			DbUtil.dbClose(rs, ps,con);
		}
		return categoryList;
	}
	
	/**
	*입력된 상품 단어를 포함하는 레코드 검색!
	**/
	@Override
	public List<ItemDTO> selectByInputItemName(String input) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = proFile.getProperty("item.selectByInputItemName");
		
		if(rs.next()) {
			
		}
		return null;
		
	}

	@Override
	public List<ItemDTO> selectByItemRegion(int regionNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertItem(ItemDTO item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateItemNo(int itemNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteItemNo(int itemNo, int sellerNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReviewDTO> selectReviewByItemNo(String ItemNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
 
	
}
