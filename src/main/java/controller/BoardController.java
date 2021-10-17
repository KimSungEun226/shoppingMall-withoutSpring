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
	 * ��ü�˻�
	 * */
	public ModelAndView select(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String pageNo = request.getParameter("pageNo");
//		if(pageNo==null || pageNo.equals("")) {
//			pageNo="1";
//		}
		List<BoardDTO> boardList = boardService.selectAll();
		
		//List<BoardDTO> boardList = boardService.selectAll(Integer.parseInt(pageNo));
		
		request.setAttribute("list", boardList); //�信�� ${requestScope.list}
//		request.setAttribute("pageNo", pageNo);
		
		return new ModelAndView("html/namdo-market/page-service-center.jsp");
	}
	
	/**
	 * �󼼺���
	 */
	public ModelAndView selectByBoardNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
	     
    	String boardNo =  request.getParameter("boardNo");
    	BoardDTO board = boardService.selectByBoardNo(boardNo, true);//boolean ���� ��ȸ�� �������θ� �Ǵ��ϴ� ��(true�϶� ��ȸ�������Ѵ�.)
    	System.out.println(board);
    	request.setAttribute("board", board);
    	
    	return new ModelAndView("html/namdo-market/page-notice.jsp");
    }
	
	
	/**
	 * ����ϱ�
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
		
		//���� ÷�ΰ� �Ǿ��ٸ�...
		if(m.getFilesystemName("file")!=null) {
			//�����̸�
			board.setFname(m.getFilesystemName("file"));
			
			//����ũ�� 
			board.setFsize((int)m.getFile("file").length() );
		}
		System.out.println("ȣ��");
		boardService.addBoard(board);
		
		
		return new ModelAndView("front", true);
	}

    /**
     * �����ϱ� ��
     * */
    public ModelAndView updateForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	String boardNo =  request.getParameter("boardNo");
    	BoardDTO board = boardService.selectByBoardNo(boardNo,false);//boolean ���� ��ȸ�� �������θ� �Ǵ��ϴ� ��(true�϶� ��ȸ�������Ѵ�.)
    	request.setAttribute("board", board);
    	
    	return new ModelAndView("html/namdo-market/page-notice-update.jsp");
    }
	
    /**
     * �����Ϸ�
     * */
    public ModelAndView updateBoard(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String boardNo = request.getParameter("boardNo");
    	String boardName = request.getParameter("boardName");
		String boardContent =  request.getParameter("boardContent");
		String password = request.getParameter("password");
		
		
		BoardDTO board = new BoardDTO(boardNo, boardName, boardContent, password);
		
		boardService.updateBoard(board);
		
		//������ �Ϸ�Ǹ� �󼼺����������� �̵��Ѵ�.
		BoardDTO dbBoard = boardService.selectByBoardNo(boardNo, false);
		
    	request.setAttribute("board", dbBoard);
    	return new ModelAndView("html/namdo-market/page-notice.jsp");
    }
    
    /**
     * �����ϱ�
     * */
    public ModelAndView deleteBoard(HttpServletRequest request , HttpServletResponse response) throws Exception{
    	String boardNo = request.getParameter("boardNo");
		String password =  request.getParameter("password");
    	
		String saveDir=request.getServletContext().getRealPath("/save");
		
    	boardService.deleteBoard(boardNo, password , saveDir);
    	
    	return new ModelAndView("front", true);
    }
	
}
