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
			
			 //proFile�� �ܺ� ~.properites ������ �ε��Ѵ�.
			   //proFile.load(new FileInputStream("src/dbQuery.properties"));
			   
			   //�� ������Ʈ ��Ÿ�ӵɶ� �� �������� ����ɶ� classes������ �������� �����ͼ� ��θ� �����ؾ��Ѵ�.
			
			  proFile.load(getClass().getClassLoader().getResourceAsStream("itemQuery.Properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}	
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
 						rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getFloat(10));
				
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
	*�Էµ� ��ǰ �ܾ �����ϴ� ���ڵ� �˻�!
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
