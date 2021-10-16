package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.QuestionDTO;
import util.DbUtil;

public class QuestionDAOImpl implements QuestionDAO {
	Properties proFile = new Properties();
	

	public QuestionDAOImpl() {
		try {
			proFile.load(getClass().getClassLoader().getResourceAsStream("questionAnswerQuery.properties"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<QuestionDTO> selectAllQuestion() throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		List<QuestionDTO> questionList = new ArrayList<QuestionDTO>();
		String sql = proFile.getProperty("question.selectAllQuestions");
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				//QuestionDTO(int questionNo, int customerNo, int itemNo, String questionName, String questionContent,
				//String questionDate, int answerFinished)
				QuestionDTO question = new QuestionDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3),
						               rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				questionList.add(question);
			}
		}finally {
			DbUtil.dbClose(rs, ps, con);
		}
		return questionList;
	}
	
	@Override
	public int createQuestion(QuestionDTO question) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("question.createQuestion");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//insert into question values(question_no.nextval, ? , ?, ?, ?, default, default)
			
			//CUSTOMER_NO
			ps.setInt(1, question.getCustomerNo());
			
			//ITEM_NO
			ps.setInt(2, question.getItemNo());
			
			//QUESTION_NAME
			ps.setString(3, question.getQuestionName());
			
			//QUESTION_CONTENT
			ps.setString(4, question.getQuestionContent());
			
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
	public int updateQuestion(String questionName, String questionContent, int questionNo, int customerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("question.updateQuestion");
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//update question set QUESTION_NAME = ?, QUESTION_CONTENT = ? where QUESTION_NO = ? and CUSTOMER_NO=?
			ps.setString(1, questionName);
			ps.setString(2, questionContent);
			ps.setInt(3, questionNo);
			ps.setInt(4, customerNo);
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
	public int deleteQuestion(int questionNo, int customerNo) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		String sql = proFile.getProperty("question.deleteQuestion");
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			//delete from question where question_no = ? and customer_no = ?
			ps.setInt(1, questionNo);
			ps.setInt(2, customerNo);
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
	public int answerFinished() throws SQLException {
		
		//리스트에 answerNo 번호를 담는다. 
		//만약에 questionNo를 
		//answer.getQuestionNo == question.questionNo 라면 존재하는걸로. 
		
		return 0;
	}

	
}
