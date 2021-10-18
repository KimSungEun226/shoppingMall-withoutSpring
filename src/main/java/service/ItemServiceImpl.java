package service;

import java.sql.SQLException;
import java.util.List;


import dao.BoardDAO;
import dao.BoardDAOImpl;
import dao.ItemDAO;
import dao.ItemDAOImpl;
import dto.BoardDTO;
import dto.ItemDTO;
import dto.ReviewDTO;

public class ItemServiceImpl implements ItemService {
	private ItemDAO itemDao = new ItemDAOImpl();
	
	@Override
	public List<ItemDTO> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemDTO> getBoardList(int pageNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemDTO> selectByCategoryNo(int categoryNo) throws SQLException {
		List<ItemDTO> itemList = itemDao.selectByCategoryNo(categoryNo);
		
		if(itemList==null) throw new SQLException(categoryNo+"번의 카테고리 상품을 조회할 수 없습니다.");
		return itemList;
	}

	@Override
	public List<ItemDTO> selectByInput(String input) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
    
	@Override
	public ItemDTO selectByNo(int itemNo) throws SQLException {
		ItemDAO dao = new ItemDAOImpl();
		ItemDTO result = dao.selectByItemNo(itemNo);
		
		return result;
	}
	
	@Override
	public List<ItemDTO> selectByRegion(int regionNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(ItemDTO item) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int itemNo, int sellerNo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int update(int itemNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReviewDTO> selectReviewByItemNum(String ItemNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
