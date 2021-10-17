package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.BoardDTO;
import service.BoardService;
import service.BoardServiceImpl;



public class BoardController implements Controller {
    private BoardService boardService = new BoardServiceImpl();

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 전체검색
	 * */
	public ModelAndView select(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String pageNo = request.getParameter("pageNo");
//		if(pageNo==null || pageNo.equals("")) {
//			pageNo="1";
//		}
		List<BoardDTO> boardList = boardService.selectAll();
		
		//List<BoardDTO> boardList = boardService.selectAll(Integer.parseInt(pageNo));
		
		request.setAttribute("list", boardList); //뷰에서 ${requestScope.list}
//		request.setAttribute("pageNo", pageNo);
		
		return new ModelAndView("page-service-center.jsp");
	}
	

	/**
	 * 상세보기
	 */
	public ModelAndView selectByBoardNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     
    	String boardNo =  request.getParameter("boardNo");
    	BoardDTO board = boardService.selectByBoardNo(boardNo, true);//boolean 형은 조회수 증가여부를 판단하는 값(true일때 조회수증가한다.)
    	request.setAttribute("board", board);
    	
    	return new ModelAndView("page-notice.jsp");
    }
	
		
}
