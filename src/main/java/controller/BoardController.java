package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

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
		
		return new ModelAndView("html/namdo-market/page-service-center.jsp");
	}
	
	/**
	 * 상세보기
	 */
	public ModelAndView selectByBoardNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     
    	String boardNo =  request.getParameter("boardNo");
    	BoardDTO board = boardService.selectByBoardNo(boardNo, true);//boolean 형은 조회수 증가여부를 판단하는 값(true일때 조회수증가한다.)
    	System.out.println(board);
    	request.setAttribute("board", board);
    	
    	return new ModelAndView("html/namdo-market/page-notice.jsp");
    }
	
	
	/**
	 * 등록하기
	 * */
    public ModelAndView addBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
       String saveDir=request.getServletContext().getRealPath("/save");
       
		int maxSize = 1024*1024*100; //100M 
		String encoding="UTF-8";

		MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		String boardName =  m.getParameter("board_name");
		String boardContent =  m.getParameter("board_content");
		String password =  m.getParameter("password");
		
		
		BoardDTO board = new BoardDTO(boardName, boardContent, password);
		
		//파일 첨부가 되었다면...
		if(m.getFilesystemName("file")!=null) {
			//파일이름
			board.setFname(m.getFilesystemName("file"));
			
			//파일크기 
			board.setFsize((int)m.getFile("file").length() );
		}
		System.out.println("호출");
		boardService.addBoard(board);
		
		
		return new ModelAndView("front", true);
	}

    /**
     * 수정하기 폼
     * */
    public ModelAndView updateForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	String boardNo =  request.getParameter("boardNo");
    	BoardDTO board = boardService.selectByBoardNo(boardNo,false);//boolean 형은 조회수 증가여부를 판단하는 값(true일때 조회수증가한다.)
    	request.setAttribute("board", board);
    	
    	return new ModelAndView("html/namdo-market/page-notice-update.jsp");
    }
	
    /**
     * 수정완료
     * */
    public ModelAndView updateBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String boardNo = request.getParameter("boardNo");
    	String boardName = request.getParameter("boardName");
		String boardContent =  request.getParameter("boardContent");
		String password = request.getParameter("password");
		
		
		BoardDTO board = new BoardDTO(boardNo, boardName, boardContent, password);
		
		boardService.updateBoard(board);
		
		//수정이 완료되면 상세보기페이지로 이동한다.
		BoardDTO dbBoard = boardService.selectByBoardNo(boardNo, false);
		
    	request.setAttribute("board", dbBoard);
    	return new ModelAndView("html/namdo-market/page-notice.jsp");
    }
    
    /**
     * 삭제하기
     * */
    public ModelAndView deleteBoard(HttpServletRequest request , HttpServletResponse response) throws Exception{
    	String boardNo = request.getParameter("boardNo");
		String password =  request.getParameter("password");
    	
		String saveDir=request.getServletContext().getRealPath("/save");
		
    	boardService.deleteBoard(boardNo, password , saveDir);
    	
    	return new ModelAndView("front", true);
    }
	
}
