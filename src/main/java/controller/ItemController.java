package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dto.ItemDTO;
import dto.SellerDTO;
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
	 * ��ü�˻�
	 * */
	public ModelAndView selectAll(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<ItemDTO> itemList = itemService.selectAll();

		request.setAttribute("itemList", itemList); //�信�� ${requestScope.list}
		
		return new ModelAndView("html/namdo-market/page-category-all.jsp");
	}
	

	/**
	 * ī�װ��� ���� �˻� ���
	 */
	public ModelAndView selectByCategoryNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int categoryNo =  Integer.parseInt(request.getParameter("categoryNo"));
    	List<ItemDTO> itemList = itemService.selectByCategoryNo(categoryNo);
    	System.out.println("������ ����: " + itemList.size());
    	request.setAttribute("itemList", itemList);
    	
    	String category = "fish.jsp";
    	if(categoryNo == 2) {
    		category = "dried.jsp";
    	}else if(categoryNo == 3) {
    		category = "seaweed.jsp";
    	}else if(categoryNo == 4) {
    		category = "shellfish.jsp";
    	}else if(categoryNo == 5) {
    		category = "salted.jsp";
    	}else if(categoryNo == 6) {
    		category = "etc.jsp";
    	}
    	
    	return new ModelAndView("html/namdo-market/page-category-" + category);
    }
	
	/**
	 * ������ ���� �˻� ���
	 */
	public ModelAndView selectByRegionNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int regionNo =  Integer.parseInt(request.getParameter("regionNo"));
    	List<ItemDTO> itemList = itemService.selectByRegion(regionNo);
    	System.out.println("������ ����: " + itemList.size());
    	request.setAttribute("itemList", itemList);
    	
    	String region = "yeonggwang.jsp";
    	if(regionNo == 2) {
    		region = "mokpo.jsp";
    	}else if(regionNo == 3) {
    		region = "muan.jsp";
    	}else if(regionNo == 4) {
    		region = "boseong.jsp";
    	}else if(regionNo == 6) {
    		region = "sinan.jsp";
    	}else if(regionNo == 7) {
    		region = "yeosu.jsp";
    	}else if(regionNo == 8) {
    		region = "wando.jsp";
    	}else if(regionNo == 9) {
    		region = "haenam.jsp";
    	}else if(regionNo == 11) {
    		region = "jindo.jsp";
    	}else if(regionNo == 14) {
    		region = "goheung.jsp";
    	}
    	
    	return new ModelAndView("html/namdo-market/page-category-region-" + region);
    }
	
	
	/**
	 * ItemDAOImpl���� �Էµ� �ܾ �����ϴ� ���ڵ� �˻� �޼ҵ� ȣ��
	 * */
	public ModelAndView selectByInputItemName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String input = request.getParameter("input");
		List<ItemDTO> itemListByInput = itemService.selectByInputItemName(input);
		System.out.println(itemListByInput);
		System.out.println("������ ����: " + itemListByInput.size());
		request.setAttribute("itemList", itemListByInput);
		
		request.setAttribute("fish-check", input);
		String fish = (String) request.getAttribute("fish-check");
		System.out.println(fish);
		
		String submenu = "fish.jsp";
		if("����".equals(fish)) {
			submenu = "fish-gulbi.jsp";
		}else if("����".equals(fish)) {
			submenu = "fish-octopus.jsp";
		}else if("ȫ��".equals(fish)) {
			submenu = "fish-skates.jsp";
		}else if("���".equals(fish)) {
			submenu = "fish-eel.jsp";
		}else if("��ġ".equals(fish)) {
			submenu = "dried-anchovy.jsp";
		}else if("Ȳ��ä".equals(fish)) {
			submenu = "dried-pollack.jsp";
		}else if("��".equals(fish)) {
			submenu = "seaweed-gim.jsp";
		}else if("�̿�".equals(fish)) {
			submenu = "seaweed-miyeok.jsp";
		}else if("����".equals(fish)) {
			submenu = "shellfish-abalone.jsp";
		}else if("������".equals(fish)) {
			submenu = "shellfish-clam.jsp";
		}else if("����".equals(fish)) {
			submenu = "shellfish-cockle.jsp";
		}else if("����".equals(fish)) {
			submenu = "shellfish-shrimp.jsp";
		}
		System.out.println(submenu);
		return new ModelAndView("html/namdo-market/page-category-" + submenu);
		
		
	}
	

	/**
	 * ����ϱ�
	 * */
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String saveDir = request.getServletContext().getRealPath("/save");
		int maxSize = 1024*1024*100; //100M
		String encoding = "UTF-8";
		
		MultipartRequest m = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
		
		HttpSession session = request.getSession();
		
		SellerDTO dto = (SellerDTO)session.getAttribute("sellerDTO");
		int sellerNo = dto.getSellerNo();
		
		int categoryNo = Integer.parseInt(m.getParameter("categoryNo"));
		int regionNo = Integer.parseInt(m.getParameter("regionNo"));
		String itemName = m.getParameter("itemName");
		int itemPrice = Integer.parseInt(m.getParameter("itemPrice"));
		int itemStock = Integer.parseInt(m.getParameter("itemStock"));
		String itemDescription = m.getParameter("itemDescription");
		
	    //Enumeration e = m.getFileNames();
		
	  //���� ÷�ΰ� �Ǿ��ٸ�...
  		if(m.getFilesystemName("mainImg") !=null ) {
  			System.out.println(m.getFilesystemName("mainImg"));
  			
  			
  		}		
   
	    //ItemDTO newItem = itemService.insert(new ItemDTO(categoryNo, sellerNo, regionNo, itemName, itemPrice, itemStock, itemDescription));

//		if (newItem==null) {
//			request.setAttribute("errmsg", "��Ͻ���");
//			return new ModelAndView("html/namdo-market/error.jsp");
//		}
//		
//        return new ModelAndView("html/namdo-market/item/insertOk.jsp");
	    return new ModelAndView("html/namdo-market/home-page.jsp");
    }

}
