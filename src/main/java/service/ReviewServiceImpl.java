package service;

import java.sql.SQLException;
import java.util.List;

import dao.ReviewDAO;
import dao.ReviewDAOImpl;
import dto.ReviewDTO;

public class ReviewServiceImpl implements ReviewService {
	private ReviewDAO reviewDao = new ReviewDAOImpl();
	
	@Override
	public List<ReviewDTO> reviewSelectByItemNo(int itemNo) throws SQLException {
		List<ReviewDTO> reviewList = reviewDao.reviewSelectByItemNo(itemNo);
		
		return reviewList;
	}

	@Override
	public void createReview(ReviewDTO review) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public int deleteReview(int reviewNo, int customerNo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
