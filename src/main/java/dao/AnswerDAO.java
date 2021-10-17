package dao;

import java.sql.SQLException;

import dto.AnswerDTO;

public interface AnswerDAO {
	/**
	 * 답변을 생성하는 기능
	 * @return: 0 - 등록실패 , 1 - 등록성공 
	 * */
	int createAnswer(AnswerDTO answer) throws SQLException;
	
	
	/**
	 * 답변을 수정하는 기능 
	 * @return: 0 - 수정실패 , 1 - 수정성공 
	 * */
	int updateAnswer(String answerName, String answerContent, int answerNo, int sellerNo) throws SQLException;
	
	
	/**
	 * 답변번호에 해당하는 답변을 삭제하는 기능 (판매자 번호와 일치해야 삭제가능)
	 * @return: 0 - 삭제실패, 1 - 삭제성공
	 * */
	int deleteAnswer(int answerNo, int sellerNo) throws SQLException; 
}
