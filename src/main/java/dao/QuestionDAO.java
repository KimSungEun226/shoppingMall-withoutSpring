package dao;

import java.sql.SQLException;
import java.util.List;

import dto.QuestionDTO;

public interface QuestionDAO {
	
    /**
     * ������ ��� �����ִ� ��� (����¡ ó�� ��)  
     * */
	List<QuestionDTO> selectAllQuestion() throws SQLException;
	
	/**
	 * ������ �����ϴ� ���
	 * @return: 0 - ��Ͻ��� , 1 - ��ϼ��� 
	 * */
	int createQuestion(QuestionDTO question) throws SQLException;
	
	/**
	 * ������ �����ϴ� ��� 
	 * */
	int updateQuestion(String questionName, String questionContent, int questionNo, int customerNo) throws SQLException;
	
	
	/**
	 * ������ȣ�� �ش��ϴ� ������ �����ϴ� ���(�ۼ��ڿ� ��ġ�ؾ� ���� ����)
	 * @return: 0 - ��������, 1 - ��������
	 * */
	int deleteQuestion(int questionNo, int customerNo) throws SQLException; 
	
	/**
	 * �亯�� �Ϸ�Ǿ����� �ȵǾ����� �˷��ִ� ��� 
	 * @return: 0 �亯 �̿Ϸ�, 1 �亯 �Ϸ� 
	 * */
	int answerFinished() throws SQLException;
}
