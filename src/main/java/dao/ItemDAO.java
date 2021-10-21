package dao;

import java.sql.SQLException;
import java.util.List;

import dto.ItemDTO;
import dto.ReviewDTO;

public interface ItemDAO {
    
	/**
	  * 레코드 전체 검색
	  * */
	  List<ItemDTO> selectAll() throws SQLException;
	  
	  /**
	   * 레코드 전체 검색(페이지처리)
	   * */
	   List<ItemDTO> getBoardList(int pageNo) throws SQLException;
	  
	  /**
	   * 카테고리에 해당하는 상품 검색
	   * */
	  List<ItemDTO> selectByCategoryNo(int categoryNo) throws SQLException;
	  
	  /**
	   * 입력된 상품 단어를 포함하는 레코드 검색
	   * */
	  List<ItemDTO> selectByInputItemName(String input) throws SQLException;
	  
	  
	  /**
	   * 해당하는 지역에 포함되는 레코드 검색
	   * */
	  List<ItemDTO> selectByRegion(int regionNo) throws SQLException;
	  
	  /**
	   * 해당하는 지역의 카테고리 레코드 검색
	   */
	  List<ItemDTO> selectByCategoryOfRegion(int regionNo, int categoryNo) throws SQLException;
	  
	  /**
	   * 해당하는 번호의 레코드 검색
	   * */
	  ItemDTO selectByItemNo(int itemNo) throws SQLException;
	  
	  /**
	  * 상품 등록하기
	  * @return : 1-삽입성공 , 0 - 삽입실패
	  * */
	  int insertItem(ItemDTO item) throws SQLException;
	  
	  
	  /**
	   * 상품 번호에 해당하는 상품 수정(상품번호)
	   * @return : 1-수정성공 , 0 - 수정실패
	   **/
	  int updateItem(ItemDTO itemDTO) throws SQLException;
	 	  
	  
	 
	  /**
	   * 상품번호에 해당하는 레코드 삭제 (입력으로 들어오는 판매자번호와 상품의 판매자 번호 비교)
	   * @return : 1-삭제성공 , 0 - 삭제실패
	   * */
	  int deleteItemNo(int itemNo, int sellerNo) throws SQLException;
	  
	
	  
	  /**
	   * 상품정보에 해당하는 리뷰 정보 가져오기
	   * */
	  List<ReviewDTO> selectReviewByItemNo(String ItemNo) throws SQLException;	
	
	  
	  List<ItemDTO> selectBySellerNo(int sellerNo) throws SQLException;

}
