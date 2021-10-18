package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ItemDTO;
import service.ItemService;
import service.ItemServiceImpl;


public class ItemController implements Controller{
	private ItemService itemService = new ItemServiceImpl();

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

		List<ItemDTO> itemList = itemService.selectAll();

		request.setAttribute("list", itemList); //뷰에서 ${requestScope.list}
		
		return new ModelAndView("html/namdo-market/page-service-center.jsp");
	}
	

	/**
	 * 카테고리에 따른 검색 결과
	 */
	public ModelAndView selectByCategoryNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int categoryNo =  Integer.parseInt(request.getParameter("categoryNo"));
    	List<ItemDTO> itemList = itemService.selectByCategoryNo(categoryNo);
    	System.out.println("아이템 개수: " + itemList.size());
    	request.setAttribute("itemList", itemList);
    	
    	return new ModelAndView("html/namdo-market/page-category-fish.jsp");
    }
	
	
	
	
	
}
