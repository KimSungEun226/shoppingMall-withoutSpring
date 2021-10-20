package service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import dao.ItemDAO;
import dao.ItemDAOImpl;
import dto.ItemDTO;
import dto.ReviewDTO;

public class ItemServiceImpl implements ItemService {
	private ItemDAO itemDao = new ItemDAOImpl();
	
	@Override
	public List<ItemDTO> selectAll() throws SQLException {
		
		return itemDao.selectAll();
	}

	@Override
	public List<ItemDTO> getBoardList(int pageNo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemDTO> selectByCategoryNo(int categoryNo) throws SQLException {
		List<ItemDTO> itemList = itemDao.selectByCategoryNo(categoryNo);
		
		if(itemList==null) throw new SQLException(categoryNo+"���� ī�װ� ��ǰ�� ��ȸ�� �� �����ϴ�.");
		return itemList;
	}

	@Override
	public List<ItemDTO> selectByInputItemName(String input) throws SQLException {
		System.out.println(input);
		List<ItemDTO> itemListByName = itemDao.selectByInputItemName(input);
		System.out.println(itemListByName);
		if(itemListByName==null) throw new SQLException("'"+input+"'�� �ش��ϴ� ��ǰ�� ��ȸ�� �� �����ϴ�.");
		return itemListByName;
	}
    
	@Override
	public ItemDTO selectByNo(int itemNo) throws SQLException {
		ItemDAO dao = new ItemDAOImpl();
		ItemDTO result = dao.selectByItemNo(itemNo);
		
		return result;
	}
	
	@Override
	public List<ItemDTO> selectByRegion(int regionNo) throws SQLException {
		List<ItemDTO> itemList = itemDao.selectByRegion(regionNo);
		
		if(itemList==null) throw new SQLException(regionNo+"���� ���� ��ǰ�� ��ȸ�� �� �����ϴ�.");
		return itemList;
	}

	@Override
	public int insert(ItemDTO item) throws SQLException {
		
		ItemDAO dao = new ItemDAOImpl();
        int result = dao.insertItem(item);	    
		
		return result;
	}

	@Override
	public void delete(int itemNo, int sellerNo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int update(ItemDTO itemDTO) throws SQLException {
		ItemDAO dao = new ItemDAOImpl();
		int result = dao.updateItem(itemDTO);
		
		
		return result;
	}

	@Override
	public List<ReviewDTO> selectReviewByItemNum(String ItemNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
