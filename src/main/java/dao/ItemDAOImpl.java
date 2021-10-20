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
//			 //proFile�� �ܺ� ~.properites ������ �ε��Ѵ�.
//			   //proFile.load(new FileInputStream("src/dbQuery.properties"));
//			   
//			   //�� ������Ʈ ��Ÿ�ӵɶ� �� �������� ����ɶ� classes������ �������� �����ͼ� ��θ� �����ؾ��Ѵ�.
//			
//			  proFile.load(getClass().getClassLoader().getResourceAsStream("itemQuery.properties"));
//		}catch(Exception e) {
//			e.printStackTrace();
//		}	

	}
	
	/**
	 * ��ǰ ��ü �˻�
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
 	 * ���ڵ� ��ü �˻�(������ó��)			
 	 **/
	@Override
	public List<ItemDTO>getBoardList(int pageNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<ItemDTO>pageList = new ArrayList<ItemDTO>();
		String sql = proFile.getProperty("item.getBoardList");
		
		
		try {
			//��ü ���ڵ� �� ���ϱ�
			int totalCount = this.getSelectTotalCount(); //��ü�Խù� ���� ��������
			//totalCount = ��ü �Խù� ����
			int totalPage = totalCount%PageCnt.pagesize==0 ? totalCount/PageCnt.pagesize : (totalCount/PageCnt.pagesize)+1;
			
			//��ü �Խù� ����%
			
			//% == ������ �� ������
			
			//����? true : false
			//int totalPage = ����? : ������ true�϶� : ������ false�϶� 
			
			//����: ��ü�Խù� ���� % �� �������� ��µ� �Խù� �� ==0 ? �� ������ ����(��ü �Խù� ����/�� �������� �Խù� ��) : �� ������ ����(��ü �Խù� ����/�� �������� �Խù� ��)+1�
			//17���ε� 8���� ����ϸ� 1�� �Խù��� �����ϱ� 1�������� �� �ø��ڴ�. 
			
			
			//�� �������� ���ϱ�
			PageCnt pageCnt = new PageCnt(); // ��ü�� �ϳ� ������.
			
			pageCnt.setPageCnt( totalPage ) ; //this.pageCnt(�� ������ ��)
			//
			pageCnt.setPageNo(pageNo);//����ڰ� Ŭ���� page��ȣ�� �����Ѵ�.     
			//���� ��������ȣ == pageNo�� �����ϰڴ�.
			
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 2��
			
			ps.setInt(1, pageNo*PageCnt.pagesize); //�ִ� 6 *5
			ps.setInt(2, (pageNo-1)*PageCnt.pagesize +1); //�ּ� (6-1)*5+1
			
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
	 * ��ü�Խù� ���� �������� 
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
			if(rs.next()) {  //rs.next() �� ���� ���� �� (== rs.next()�� ������ �� if  ��� // item ������ �����Ѵٸ�, 
			   result = rs.getInt(1); // �� item ������ result�� �޴´�. 
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return result;  // item ������ ��ȯ�Ѵ�. count(*)  -> count(������ ���� �Լ�)
	}
	

	/**
	 * ī�װ��� �ش��ϴ� ��ǰ �˻� 
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
	 * �ش��ϴ� ������ ���ԵǴ� ���ڵ� �˻�
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
	*�Էµ� ��ǰ �ܾ �����ϴ� ���ڵ� �˻�
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
	 * �ش��ϴ� ������ ī�װ� �˻�
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
	 * �ش��ϴ� ��ȣ�� ���ڵ� �˻�
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
	  * ��ǰ ����ϱ�
	  * @return : 1-���Լ��� , 0 - ���Խ���
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
			
			//ī�װ���ȣ
		    ps.setInt(1,item.getCategoryNo());
		    //�Ǹ��� ��ȣ
	        ps.setInt(2, item.getSellerNo());
	        //������ȣ
		    ps.setInt(3, item.getRegionNo());
		    //��ǰ�̸�
		    ps.setString(4, item.getItemName());
		    //��ǰ ����
		    ps.setInt(5, item.getItemPrice());
		    //��ǰ ���
			ps.setInt(6, item.getItemStock());
			//��ǰ����
		    ps.setFloat(7, 0);
		    //��ǰ����
		    ps.setString(8, item.getItemDescription());
		    //�����̹����̸�
		    ps.setString(9, item.getMainImg());
		    //�������̹����̸�
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
	   * ��ǰ ��ȣ�� �ش��ϴ� ���ڵ� ����(��ǰ��ȣ)
	   * @return : 1-�������� , 0 - ��������
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
	   * ��ǰ��ȣ�� �ش��ϴ� ���ڵ� ���� (�Է����� ������ �Ǹ��ڹ�ȣ�� ��ǰ�� �Ǹ��� ��ȣ ��)
	   * @return : 1-�������� , 0 - ��������
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
	   * ��ǰ������ �ش��ϴ� ���� ���� ��������
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
