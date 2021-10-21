package dao;

import java.sql.SQLException;
import java.util.List;

import dto.ItemDTO;
import dto.ReviewDTO;

public interface ItemDAO {
    
	/**
	  * ���ڵ� ��ü �˻�
	  * */
	  List<ItemDTO> selectAll() throws SQLException;
	  
	  /**
	   * ���ڵ� ��ü �˻�(������ó��)
	   * */
	   List<ItemDTO> getBoardList(int pageNo) throws SQLException;
	  
	  /**
	   * ī�װ��� �ش��ϴ� ��ǰ �˻�
	   * */
	  List<ItemDTO> selectByCategoryNo(int categoryNo) throws SQLException;
	  
	  /**
	   * �Էµ� ��ǰ �ܾ �����ϴ� ���ڵ� �˻�
	   * */
	  List<ItemDTO> selectByInputItemName(String input) throws SQLException;
	  
	  
	  /**
	   * �ش��ϴ� ������ ���ԵǴ� ���ڵ� �˻�
	   * */
	  List<ItemDTO> selectByRegion(int regionNo) throws SQLException;
	  
	  /**
	   * �ش��ϴ� ������ ī�װ� ���ڵ� �˻�
	   */
	  List<ItemDTO> selectByCategoryOfRegion(int regionNo, int categoryNo) throws SQLException;
	  
	  /**
	   * �ش��ϴ� ��ȣ�� ���ڵ� �˻�
	   * */
	  ItemDTO selectByItemNo(int itemNo) throws SQLException;
	  
	  /**
	  * ��ǰ ����ϱ�
	  * @return : 1-���Լ��� , 0 - ���Խ���
	  * */
	  int insertItem(ItemDTO item) throws SQLException;
	  
	  
	  /**
	   * ��ǰ ��ȣ�� �ش��ϴ� ��ǰ ����(��ǰ��ȣ)
	   * @return : 1-�������� , 0 - ��������
	   **/
	  int updateItem(ItemDTO itemDTO) throws SQLException;
	 	  
	  
	 
	  /**
	   * ��ǰ��ȣ�� �ش��ϴ� ���ڵ� ���� (�Է����� ������ �Ǹ��ڹ�ȣ�� ��ǰ�� �Ǹ��� ��ȣ ��)
	   * @return : 1-�������� , 0 - ��������
	   * */
	  int deleteItemNo(int itemNo, int sellerNo) throws SQLException;
	  
	
	  
	  /**
	   * ��ǰ������ �ش��ϴ� ���� ���� ��������
	   * */
	  List<ReviewDTO> selectReviewByItemNo(String ItemNo) throws SQLException;	
	
	  
	  List<ItemDTO> selectBySellerNo(int sellerNo) throws SQLException;

}
