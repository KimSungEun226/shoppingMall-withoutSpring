package dao;

import java.sql.SQLException;
import java.util.List;

import dto.QuestionDTO;

public interface QuestionDAO {
	
    /**
     * 질문을 모두 보여주는 기능 (페이징 처리 완)  
     * */
	List<QuestionDTO> selectAllQuestion() throws SQLException;
	
	/**
	 * 질문을 생성하는 기능
	 * @return: 0 - 등록실패 , 1 - 등록성공 
	 * */
	int createQuestion(QuestionDTO question) throws SQLException;
	
	/**
	 * 질문을 수정하는 기능 
	 * */
	int updateQuestion(String questionName, String questionContent, int questionNo, int customerNo) throws SQLException;
	
	
	/**
	 * 질문번호에 해당하는 질문을 삭제하는 기능(작성자와 일치해야 삭제 가능)
	 * @return: 0 - 삭제실패, 1 - 삭제성공
	 * */
	int deleteQuestion(int questionNo, int customerNo) throws SQLException; 
	
	/**
	 * 답변이 완료되었는지 안되었는지 알려주는 기능 
	 * @return: 0 답변 미완료, 1 답변 완료 
	 * */
	int answerFinished() throws SQLException;
}
