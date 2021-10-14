package dao;

import java.sql.SQLException;
import java.util.List;

import dto.ItemDTO;
import dto.ReviewDTO;

public class ItemDAOImpl implements ItemDAO {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemDTO> selectByInputItemName(String input) throws SQLException {
		// TODO Auto-generated method stub
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
	public List<ReviewDTO> selectReviewByItemNum(String ItemNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
