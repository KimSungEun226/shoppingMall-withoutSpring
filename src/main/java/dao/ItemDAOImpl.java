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

//		try {
//			
//			 //proFile¿¡ ¿ÜºÎ ~.properites ÆÄÀÏÀ» ·ÎµùÇÑ´Ù.
//			   //proFile.load(new FileInputStream("src/dbQuery.properties"));
//			   
//			   //Çö ÇÁ·ÎÁ§Æ® ·±Å¸ÀÓµÉ¶§ Áï ¼­¹ö¿¡¼­ ½ÇÇàµÉ¶§ classesÆú´õ¸¦ µ¿ÀûÀ¸·Î °¡Á®¿Í¼­ °æ·Î¸¦ ¼³Á¤ÇØ¾ßÇÑ´Ù.
//			
//			  proFile.load(getClass().getClassLoader().getResourceAsStream("itemQuery.properties"));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	

	}
	
	/**
	 * »óÇ° ÀüÃ¼ °Ë»ö
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
 	 * ·¹ÄÚµå ÀüÃ¼ °Ë»ö(ÆäÀÌÁöÃ³¸®)			
 	 **/
	@Override
	public List<ItemDTO>getBoardList(int pageNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<ItemDTO>pageList = new ArrayList<ItemDTO>();
		String sql = proFile.getProperty("item.getBoardList");
		
		
		try {
			//ÀüÃ¼ ·¹ÄÚµå ¼ö ±¸ÇÏ±â
			int totalCount = this.getSelectTotalCount(); //ÀüÃ¼°Ô½Ã¹° °³¼ö °¡Á®¿À±â
			//totalCount = ÀüÃ¼ °Ô½Ã¹° °³¼ö
			int totalPage = totalCount%PageCnt.pagesize==0 ? totalCount/PageCnt.pagesize : (totalCount/PageCnt.pagesize)+1;
			
			//ÀüÃ¼ °Ô½Ã¹° °³¼ö%
			
			//% == ³ª´©°í ³­ ³ª¸ÓÁö
			
			//Á¶°Ç? true : false
			//int totalPage = Á¶°Ç? : Á¶°ÇÀÌ trueÀÏ¶§ : Á¶°ÇÀÌ falseÀÏ¶§ 
			
			//Á¶°Ç: ÀüÃ¼°Ô½Ã¹° °³¼ö % ÇÑ ÆäÀÌÁö´ç Ãâ·ÂµÉ °Ô½Ã¹° ¼ö ==0 ? ÃÑ ÆäÀÌÁö ¼ö´Â(ÀüÃ¼ °Ô½Ã¹° °³¼ö/ÇÑ ÆäÀÌÁö´ç °Ô½Ã¹° ¼ö) : ÃÑ ÆäÀÌÁö ¼ö´Â(ÀüÃ¼ °Ô½Ã¹° °³¼ö/ÇÑ ÆäÀÌÁö´ç °Ô½Ã¹° ¼ö)+1‚
			//17°³ÀÎµ¥ 8°³¾¿ Ãâ·ÂÇÏ¸é 1°³ °Ô½Ã¹°ÀÌ ³²À¸´Ï±î 1ÆäÀÌÁö¸¦ ´õ ´Ã¸®°Ú´Ù. 
			
			
			//ÃÑ ÆäÀÌÁö¼ö ±¸ÇÏ±â
			PageCnt pageCnt = new PageCnt(); // °´Ã¼¸¦ ÇÏ³ª »ý¼ºÇÔ.
			
			pageCnt.setPageCnt( totalPage ) ; //this.pageCnt(ÃÑ ÆäÀÌÁö ¼ö)
			//
			pageCnt.setPageNo(pageNo);//»ç¿ëÀÚ°¡ Å¬¸¯ÇÑ page¹øÈ£·Î ¼³Á¤ÇÑ´Ù.     
			//ÇöÀç ÆäÀÌÁö¹øÈ£ == pageNo·Î Á¤ÀÇÇÏ°Ú´Ù.
			
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 2°³
			
			ps.setInt(1, pageNo*PageCnt.pagesize); //ÃÖ´ë 6 *5
			ps.setInt(2, (pageNo-1)*PageCnt.pagesize +1); //ÃÖ¼Ò (6-1)*5+1
			
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
	 * ÀüÃ¼°Ô½Ã¹° °³¼ö °¡Á®¿À±â 
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
			if(rs.next()) {  //rs.next() °¡ °ªÀÌ ÀÖÀ» ¶§ (== rs.next()ÀÌ Á¸ÀçÇÒ ¶§ if  »ç¿ë // item °¹¼ö°¡ Á¸ÀçÇÑ´Ù¸é, 
			   result = rs.getInt(1); // ±× item °¹¼ö¸¦ result·Î ¹Þ´Â´Ù. 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return result;  // item °¹¼ö¸¦ ¹ÝÈ¯ÇÑ´Ù. count(*)  -> count(°¹¼ö¸¦ ¼¼´Â ÇÔ¼ö)
	}
	

	/**
	 * Ä«Å×°í¸®¿¡ ÇØ´çÇÏ´Â »óÇ° °Ë»ö 
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
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				categoryList.add(itemDTO);
			}
		} finally {
			DbUtil.dbClose(rs, ps,con);
		}
		
		return categoryList;
	}
	
	/**
	*ÀÔ·ÂµÈ »óÇ° ´Ü¾î¸¦ Æ÷ÇÔÇÏ´Â ·¹ÄÚµå °Ë»ö
	**/
	@Override
	public List<ItemDTO> selectByInputItemName(String input) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ItemDTO> inputItemNameList = new ArrayList<ItemDTO>();  
		String sql = proFile.getProperty("item.selectByInputItemName");
		
		try {
			con =DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, input);
			rs =ps.executeQuery(); 
		while(rs.next()) {
			ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
			inputItemNameList.add(itemDTO); 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return inputItemNameList;
		
	}

	
	/**
	 * ÇØ´çÇÏ´Â ¹øÈ£ÀÇ ·¹ÄÚµå °Ë»ö
	 * */
	@Override
	public ItemDTO selectByItemNo(int itemNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ItemDTO itemDTO = null;
		String sql = proFile.getProperty("item.selectByItemNo");
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement("select * from item where item_No =?");
			ps.setInt(1, itemNo);
			rs = ps.executeQuery();
			if(rs.next()) {
				itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return itemDTO;
	}	
	
	/**
	 * ÇØ´çÇÏ´Â Áö¿ª¿¡ Æ÷ÇÔµÇ´Â ·¹ÄÚµå °Ë»ö
	 * 
	 **/
	
	@Override
	public List<ItemDTO> selectByItemRegion(int regionNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ItemDTO> itemRegionList = new ArrayList<ItemDTO>();
		String sql = proFile.getProperty("item.selectByItemRegion");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, regionNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ItemDTO itemDTO = new ItemDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
			itemRegionList.add(itemDTO);
				}
		}finally {
			DbUtil.dbClose(rs,ps, con);
		}
		return itemRegionList;
	}
	
	
	/**
	  * »óÇ° µî·ÏÇÏ±â
	  * @return : 1-»ðÀÔ¼º°ø , 0 - »ðÀÔ½ÇÆÐ
	  * */

	@Override
	public int insertItem(ItemDTO item) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("item.insertItem");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//insert into item values(item_no.nextval, ?, ?, ?, ?, ?, ?, default, default, ?)
			// »óÇ° ¹øÈ£ 
			ps.setInt(1, item.getItemNo());
			//Ä«Å×°í¸®¹øÈ£
		    ps.setInt(2,item.getCategoryNo());
		    //ÆÇ¸ÅÀÚ ¹øÈ£
	        ps.setInt(3, item.getSellerNo());
	        //Áö¿ª¹øÈ£
		    ps.setInt(4, item.getRegionNo());
		    //»óÇ°ÀÌ¸§
		    ps.setString(5, item.getItemName());
		    //»óÇ° °¡°Ý
		    ps.setInt(6, item.getItemPrice());
		    //»óÇ° Àç°í·®
			ps.setInt(7, item.getItemStock());
			//»óÇ°µî·ÏÀÏ
			ps.setString(8, item.getItemAddDate());
			//»óÇ°½ÂÀÎ¿©ºÎ
		    ps.setString(9, item.getItemApprove());
		    //»óÇ°ÆòÁ¡
		    ps.setFloat(10, item.getItemGrade());
		    result = ps.executeUpdate();
		    
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			DbUtil.dbClose(ps, con);
		}
		return result;

	}

	/**
	   * »óÇ° ¹øÈ£¿¡ ÇØ´çÇÏ´Â »óÇ° ¼öÁ¤(»óÇ°¹øÈ£)
	   * @return : 1-¼öÁ¤¼º°ø , 0 - ¼öÁ¤½ÇÆÐ
	   **/
	
	@Override
	public int updateItemNo(int itemNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("item.updateItemNo");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, itemNo);
			result = ps.executeUpdate();
			
		}finally {
			DbUtil.dbClose(ps, con);
			
		}
		return result;
	}

	/**
	   * »óÇ°¹øÈ£¿¡ ÇØ´çÇÏ´Â ·¹ÄÚµå »èÁ¦ (ÀÔ·ÂÀ¸·Î µé¾î¿À´Â ÆÇ¸ÅÀÚ¹øÈ£¿Í »óÇ°ÀÇ ÆÇ¸ÅÀÚ ¹øÈ£ ºñ±³)
	   * @return : 1-»èÁ¦¼º°ø , 0 - »èÁ¦½ÇÆÐ
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
	   * »óÇ°Á¤º¸¿¡ ÇØ´çÇÏ´Â ¸®ºä Á¤º¸ °¡Á®¿À±â
	   * */
	
	@Override
	public List<ReviewDTO> selectReviewByItemNo(String ItemNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<ReviewDTO> itemNoList= new ArrayList<ReviewDTO>();
		String sql = proFile.getProperty("selectReviewByItemNo");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, ItemNo);
			rs = ps.executeQuery();
			while(rs.next()) {
				ReviewDTO reviewDto= new ReviewDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6));
			itemNoList.add(reviewDto);
				}
			}finally {
				DbUtil.dbClose(rs,ps,con);
			}
		
		return itemNoList;
	}



}
