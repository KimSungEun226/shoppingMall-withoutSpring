package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ItemDTO;
import dto.OrderDTO;
import dto.ReviewDTO;
import paging.PageCnt;
import util.DbUtil;

public class ItemDAOImpl implements ItemDAO {

	
	Properties proFile = new Properties();
	
	public ItemDAOImpl() {

//		try {
//			
//			 //proFile에 외부 ~.properites 파일을 로딩한다.
//			   //proFile.load(new FileInputStream("src/dbQuery.properties"));
//			   
//			   //현 프로젝트 런타임될때 즉 서버에서 실행될때 classes폴더를 동적으로 가져와서 경로를 설정해야한다.
//			
//			  proFile.load(getClass().getClassLoader().getResourceAsStream("itemQuery.properties"));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	

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
 		String sql = "select * from item";
 		try {
 			con = DbUtil.getConnection();
 			ps = con.prepareStatement(sql);
 			rs = ps.executeQuery();
 			while(rs.next()) {
 				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
				
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
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
				
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
		System.out.println(categoryNo);
		String sql = "select * from item where category_No = ?";
		System.out.println(sql);
		try {
			con = DbUtil.getConnection();
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, categoryNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
				categoryList.add(itemDTO);
			}
		} finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return categoryList;
	}
	
	/**
	 * 해당하는 지역에 포함되는 레코드 검색
	 * 
	 **/
	@Override
	public List<ItemDTO> selectByRegion(int regionNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ItemDTO> itemRegionList = new ArrayList<ItemDTO>();
		String sql = "select * from item where region_No = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, regionNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
			itemRegionList.add(itemDTO);
				}
		}finally {
			DbUtil.dbClose(rs,ps, con);
		}
		return itemRegionList;
	}
	
	/**
	*입력된 상품 단어를 포함하는 레코드 검색
	**/
	@Override
	public List<ItemDTO> selectByInputItemName(String input) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ItemDTO> inputItemNameList = new ArrayList<ItemDTO>();  
		String sql = "select * from item where item_Name like ?";
		
		try {
			con =DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+input+"%");
			System.out.println(ps);
			
			rs =ps.executeQuery(); 
		while(rs.next()) {
			ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
			inputItemNameList.add(itemDTO); 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return inputItemNameList;
		
	}
	
	/**
	 * 해당하는 지역의 카테고리 검색
	 */
	@Override
	public List<ItemDTO> selectByCategoryOfRegion(int regionNo, int categoryNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ItemDTO> inputCategoryOfRegion = new ArrayList<ItemDTO>();  
		String sql = "select * from item where region_no = ? and category_no = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, regionNo);
			ps.setInt(2, categoryNo);
			System.out.println(ps);
			
			rs =ps.executeQuery(); 
		while(rs.next()) {
			ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
			inputCategoryOfRegion.add(itemDTO); 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return inputCategoryOfRegion;
	}
	
	/**
	 * 해당하는 번호의 레코드 검색
	 * */
	@Override
	public ItemDTO selectByItemNo(int itemNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ItemDTO itemDTO = null;
		String sql = "select * from item where item_No=?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, itemNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
				}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return itemDTO;
	}	

	/**
	  * 상품 등록하기
	  * @return : 1-삽입성공 , 0 - 삽입실패
	  * */

	@Override
	public int insertItem(ItemDTO item) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;

		int result = 0;
		String sql = "insert into item values(seq_item_no.nextval, ?, ?, ?, ?, ?, ?, default, default, ?, ?, ?, ?)";

		
		try {
			con = DbUtil.getConnection();

			ps = con.prepareStatement(sql);
			
			//카테고리번호
		    ps.setInt(1,item.getCategoryNo());
		    //판매자 번호
	        ps.setInt(2, item.getSellerNo());
	        //지역번호
		    ps.setInt(3, item.getRegionNo());
		    //상품이름
		    ps.setString(4, item.getItemName());
		    //상품 가격
		    ps.setInt(5, item.getItemPrice());
		    //상품 재고량
			ps.setInt(6, item.getItemStock());
			//상품평점
		    ps.setFloat(7, 0);
		    //상품설명
		    ps.setString(8, item.getItemDescription());
		    //메인이미지이름
		    ps.setString(9, item.getMainImg());
		    //디테일이미지이름
		    ps.setString(10, item.getDetailImg());

		    result = ps.executeUpdate();
		    
		    
		    
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;		
	}
	
	
	

	/**
	   * 상품 번호에 해당하는 레코드 수정(상품번호)
	   * @return : 1-수정성공 , 0 - 수정실패
	   **/
	
	@Override
	public int updateItem(ItemDTO itemDTO) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = "update item set category_no= ?, region_no=?, item_name=?, item_price=?, item_stock=?, item_description=?, main_img=?, detail_img=? where item_no=?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, itemDTO.getCategoryNo());
			ps.setInt(2, itemDTO.getRegionNo());
			ps.setString(3, itemDTO.getItemName());
			ps.setInt(4, itemDTO.getItemPrice());
			ps.setInt(5, itemDTO.getItemStock());
			ps.setString(6, itemDTO.getItemDescription());
			ps.setString(7, itemDTO.getMainImg());
			ps.setString(8, itemDTO.getDetailImg());
			ps.setInt(9, itemDTO.getItemNo());
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
			
		}
		return result;
	}

	/**
	   * 상품번호에 해당하는 레코드 삭제 (입력으로 들어오는 판매자번호와 상품의 판매자 번호 비교)
	   * @return : 1-삭제성공 , 0 - 삭제실패
	   * */
	
	@Override
	public int deleteItemNo(int itemNo, int sellerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("item.deleteItemNo");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, itemNo);
			ps.setInt(2, sellerNo);
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

	/**
	   * 상품정보에 해당하는 리뷰 정보 가져오기
	   * */
	
	@Override
	public List<ReviewDTO> selectReviewByItemNo(int ItemNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReviewDTO> reviewList = new ArrayList<ReviewDTO>();
		String sql = "select * from review where item_no = ?";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, ItemNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ReviewDTO reviewDto= new ReviewDTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5),
						rs.getString(6));
				reviewList.add(reviewDto);
				}
			}finally {
				DbUtil.dbClose(rs,ps,con);
			}
		
		return reviewList;
	}

	@Override
	public List<ItemDTO> selectBySellerNo(int sellerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps =null;
		ResultSet rs= null;
		List<ItemDTO> itemList = new ArrayList<ItemDTO>();
		String sql = "select * from item where seller_no = ?";
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, sellerNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10), rs.getString(11), rs.getString(12), rs.getString(13));
				//System.out.println(itemDTO);
				itemList.add(itemDTO);
			}
		}finally {
			DbUtil.dbClose(rs, ps,con);
		}
		return itemList;
	}

}
