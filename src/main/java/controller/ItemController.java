package controller;

import java.io.File;
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
	 * 전체검색
	 * */
	public ModelAndView selectAll(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<ItemDTO> itemList = itemService.selectAll();

		request.setAttribute("itemList", itemList); //뷰에서 ${requestScope.list}
		
		return new ModelAndView("html/namdo-market/page-category-all.jsp");
	}
	

	/**
	 * 카테고리에 따른 검색 결과
	 */
	public ModelAndView selectByCategoryNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int categoryNo =  Integer.parseInt(request.getParameter("categoryNo"));
    	List<ItemDTO> itemList = itemService.selectByCategoryNo(categoryNo);
    	System.out.println("아이템 개수: " + itemList.size());
    	request.setAttribute("itemList", itemList);
    	
    	String category = "fish.jsp";
    	if(categoryNo == 2) category = "dried.jsp";
    	else if(categoryNo == 3) category = "seaweed.jsp";
    	else if(categoryNo == 4) category = "shellfish.jsp";
    	else if(categoryNo == 5) category = "salted.jsp";
    	else if(categoryNo == 6) category = "etc.jsp";
    	
    	
    	return new ModelAndView("html/namdo-market/page-category-" + category);
    }
	
	/**
	 * 지역에 따른 검색 결과
	 */
	public ModelAndView selectByRegionNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int regionNo =  Integer.parseInt(request.getParameter("regionNo"));
    	List<ItemDTO> itemList = itemService.selectByRegion(regionNo);
    	System.out.println("아이템 개수: " + itemList.size());
    	request.setAttribute("itemList", itemList);
    	
    	String region = "yeonggwang.jsp";
    	if(regionNo == 2) region = "mokpo.jsp";
    	else if(regionNo == 3) region = "muan.jsp";
    	else if(regionNo == 4) region = "boseong.jsp";
    	else if(regionNo == 6) region = "sinan.jsp";
    	else if(regionNo == 7) region = "yeosu.jsp";
    	else if(regionNo == 8) region = "wando.jsp";
    	else if(regionNo == 9) region = "haenam.jsp";
    	else if(regionNo == 11) region = "jindo.jsp";
    	else if(regionNo == 14) region = "goheung.jsp";
    	
    	return new ModelAndView("html/namdo-market/page-category-region-" + region);
    }
	
	/**
	 * 특정한 지역에서의 카테고리 번호에 해당하는 레코드 검색 메소드 호출
	 */
	public ModelAndView selectByCategoryOfRegion(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	int regionNo =  Integer.parseInt(request.getParameter("regionNo"));
    	int categoryNo =  Integer.parseInt(request.getParameter("categoryNo"));
    	
    	List<ItemDTO> itemList = itemService.selectByCategoryOfRegion(regionNo, categoryNo);
    	System.out.println("아이템 개수: " + itemList.size());
    	request.setAttribute("itemList", itemList);

    	String region = "yeonggwang";
    	if(regionNo == 2) region = "mokpo";
    	else if(regionNo == 3) region = "muan";
    	else if(regionNo == 4) region = "boseong";
    	else if(regionNo == 6) region = "sinan";
    	else if(regionNo == 7) region = "yeosu";
    	else if(regionNo == 8) region = "wando";
    	else if(regionNo == 9) region = "haenam";
    	else if(regionNo == 11) region = "jindo";
    	else if(regionNo == 14) region = "goheung";

    	String category = "fish.jsp";
    	if(categoryNo == 2) category = "dried.jsp";
    	else if(categoryNo == 3) category = "seaweed.jsp";
    	else if(categoryNo == 4) category = "shellfish.jsp";
    	else if(categoryNo == 5) category = "salted.jsp";
    	else if(categoryNo == 6) category = "etc.jsp";
		
		
    	return new ModelAndView("html/namdo-market/page-category-region-" + region + "-" + category);
    }
	
	/**
	 * ItemDAOImpl에서 입력된 단어를 포함하는 레코드 검색 메소드 호출
	 * */
	public ModelAndView selectByInputItemName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String input = request.getParameter("input");
		List<ItemDTO> itemListByInput = itemService.selectByInputItemName(input);
		System.out.println(itemListByInput);
		System.out.println("아이템 개수: " + itemListByInput.size());
		request.setAttribute("itemList", itemListByInput);
		
		request.setAttribute("cat-check", input);
		String fish = (String) request.getAttribute("cat-check");
		
		String submenu = "fish.jsp";
		if("굴비".equals(fish)) submenu = "fish-gulbi.jsp";
		else if("낙지".equals(fish)) submenu = "fish-octopus.jsp";
		else if("홍어".equals(fish)) submenu = "fish-skates.jsp";
		else if("장어".equals(fish)) submenu = "fish-eel.jsp";
		else if("멸치".equals(fish)) submenu = "dried-anchovy.jsp";
		else if("황태채".equals(fish)) submenu = "dried-pollack.jsp";
		else if("김".equals(fish)) submenu = "seaweed-gim.jsp";
		else if("미역".equals(fish)) submenu = "seaweed-miyeok.jsp";
		else if("전복".equals(fish)) submenu = "shellfish-abalone.jsp";
		else if("바지락".equals(fish)) submenu = "shellfish-clam.jsp";
		else if("꼬막".equals(fish)) submenu = "shellfish-cockle.jsp";
		else if("새우".equals(fish)) submenu = "shellfish-shrimp.jsp";
		
		return new ModelAndView("html/namdo-market/page-category-" + submenu);
		
		
	}
	

	/**
	 * 등록하기
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
		
		ItemDTO itemDTO = new ItemDTO(categoryNo, sellerNo, regionNo, itemName, itemPrice, itemStock, itemDescription);
		
		
		if(m.getFilesystemName("mainImg") !=null ) {
  			itemDTO.setMainImg(m.getFilesystemName("mainImg"));
  		}
		
		if(m.getFilesystemName("detailImg") !=null ) {
  			itemDTO.setDetailImg(m.getFilesystemName("detailImg"));
  		}
		
	    int result = itemService.insert(itemDTO);

		if (result == 0) {
			request.setAttribute("errmsg", "등록실패");
			return new ModelAndView("html/namdo-market/error.jsp");
		}
		
        return new ModelAndView("html/namdo-market/item/insertOk.jsp");
        
    }
    

    
	public ModelAndView selectDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		int itemNo =  Integer.parseInt(request.getParameter("itemNo"));
		ItemDTO itemDTO = itemService.selectByNo(itemNo);
		
		if (itemDTO ==null) {
			request.setAttribute("errmsg", "등록된 제품이 존재하지 않습니다.");
			return new ModelAndView("html/namdo-market/error.jsp");
		}
		
		request.setAttribute("item", itemDTO);
		
		return new ModelAndView("html/namdo-market/page-single-product.jsp");
	}
	
	/**
	 * 수정전에 item정보를 request에 담아 전달하기 위해 사용하는 메소드
	 * */
	public ModelAndView checkUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//우선 현재 접속된 판매자 번호와 등록된 아이템의 판매자 번호가 같은지 확인
		
		int itemNo = Integer.parseInt(request.getParameter("itemNo"));
		
		ItemService itemService = new ItemServiceImpl();
		
		ItemDTO itemDTO = itemService.selectByNo(itemNo);
		
		request.setAttribute("itemDTO", itemDTO);
		
        return new ModelAndView("html/namdo-market/page-item-update.jsp");
        
    }
	
	
	/**
	 * 수정하기
	 * */
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//우선 현재 접속된 판매자 번호와 등록된 아이템의 판매자 번호가 같은지 확인
		
		int itemNo = Integer.parseInt(request.getParameter("itemNo"));
		
		ItemDTO prevItem = itemService.selectByNo(itemNo);
		String prevmainImg = prevItem.getMainImg();
		String prevdetailImg = prevItem.getDetailImg();
		
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
		
		ItemDTO itemDTO = new ItemDTO(categoryNo, sellerNo, regionNo, itemName, itemPrice, itemStock, itemDescription);
		itemDTO.setItemNo(prevItem.getItemNo());
		
		if(m.getFilesystemName("mainImg") !=null ) {
  			itemDTO.setMainImg(m.getFilesystemName("mainImg"));
  		}
		
		if(m.getFilesystemName("detailImg") !=null ) {
  			itemDTO.setDetailImg(m.getFilesystemName("detailImg"));
  		}
		
	    int result = itemService.update(itemDTO);

		if (result == 0) {
			request.setAttribute("errmsg", "수정실패");
			return new ModelAndView("html/namdo-market/error.jsp");
		}
		
		//수정이 성공했다면 기존에 있던 이미지 삭제!
		if(prevItem.getMainImg() != null) {
			//폴더에서 삭제
			new File(saveDir+"/"+prevmainImg).delete();
		}
		
		if(prevItem.getDetailImg() != null) {
			//폴더에서 삭제
			new File(saveDir+"/"+prevdetailImg).delete();
		}

		
        return new ModelAndView("html/namdo-market/item/updateOk.jsp");
        
    }
}
