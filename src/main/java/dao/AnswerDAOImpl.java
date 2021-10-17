package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import dto.AnswerDTO;
import util.DbUtil;

public class AnswerDAOImpl implements AnswerDAO {
	Properties proFile = new Properties();

	public AnswerDAOImpl() {
		try {
			proFile.load(getClass().getClassLoader().getResourceAsStream("questionAnswerQuery.properties"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//해당하는 질문에 field값을 바꾼다. (Answer_Finished)
	
	@Override
	public int createAnswer(AnswerDTO answer) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("answer.createAnswer");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//insert into answer values(ANSWER_NO.NEXTVAL, ?, ?, ?, ?, DEFAULT);
			//QUESTION_NO
			ps.setInt(1, answer.getQuestionNo());
			//SELLER_NO
			ps.setInt(2, answer.getSellerNo());
			//ANSWER_NAME
			ps.setString(3, answer.getAnswerName());
			//ANSWER_CONTENT
			ps.setString(4, answer.getAnswerContent());
			
			result = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}

   
	@Override
	public int updateAnswer(String answerName, String answerContent, int answerNo, int sellerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("answer.updateAnswer");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//update answer set answer_name=?, answer_content = ? where answer_no = ? and seller_no=?
			ps.setString(1, answerName);
			ps.setString(2, answerContent);
			ps.setInt(3, answerNo);
			ps.setInt(4, sellerNo);
			result = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
	
	@Override
	public int deleteAnswer(int answerNo, int sellerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("answer.deleteAnswer");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//delete from answer where answer_no = ? and seller_no = ?
			ps.setInt(1, answerNo);
			ps.setInt(2, sellerNo);
			result = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		finally {
			DbUtil.dbClose(ps, con);
		}
		return result;
	}
}
