package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.SellerDTO;
import service.SellerService;
import service.SellerServiceImpl;


public class SellerController implements Controller{
	
	private SellerService sellerService = new SellerServiceImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//ajax�� �����ϴ�.
//	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String sellerId = request.getParameter("sellerId");
//		String pwd = request.getParameter("sellerPwd");
//		
//		sellerDTO sellerDTO = sellerService.loginCheck(new sellerDTO(sellerId, pwd));
//		
//		//������� �Դٴ� �̾߱�� ���ܾ��� �����̹Ƿ� session�� ������ �����Ѵ�.
//		HttpSession session = request.getSession();
//		session.setAttribute("sellerDTO", sellerDTO);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("home-page.jsp");
//		
//		//�ǿ���� ������Ʈ�� �����ȴ�.(������ redirect���� ����)
//		mv.setRedirect(true);
//		
//		return mv;
//	}
	
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return new ModelAndView("html/namdo-market/home-page.jsp", true);
	}
    
	
	
	public ModelAndView signUp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SellerService sellerService = new SellerServiceImpl();
		String sellerId = request.getParameter("sellerId");
		String sellerPwd = request.getParameter("sellerPwd");
		String sellerName = request.getParameter("sellerName");
		String sellerEmail = request.getParameter("sellerEmail");
		String sellerAddr = request.getParameter("sellerAddr")+request.getParameter("sellerDetailAddr");
		String sellerContact = request.getParameter("sellerContact");
		int sellerBusinessNo = Integer.parseInt(request.getParameter("sellerBusinessNo"));
		
		System.out.println(sellerId +" "+ sellerPwd +" "+ sellerEmail +" "+ sellerAddr +" "+ sellerContact + " " + sellerBusinessNo);
		
		SellerDTO sellerDTO = new SellerDTO(sellerId, sellerPwd, sellerName, sellerEmail, sellerAddr, sellerContact, sellerBusinessNo);
		int result = sellerService.signUpSeller(sellerDTO);
		
		if(result ==0) {
			request.setAttribute("errmsg", "��Ͻ����Դϴٸ�");
			return new ModelAndView("html/namdo-market/error/error.jsp");
			}
		return new ModelAndView("html/namdo-market/signUp/signUpOk.jsp", true);
	}
	
	
	public ModelAndView searchIdSeller(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SellerService sellerService = new SellerServiceImpl();
		String name = request.getParameter("sellerName");
		String email = request.getParameter("sellerEmail");
		String result = sellerService.searchIdSeller(name, email);
		
		if(result==null) {
			request.setAttribute("errmsg", "��ġ�ϴ� ������ ID�� �������� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		
		request.setAttribute("searchId", result);
		request.setAttribute("info", "seller");
		return new ModelAndView("html/namdo-market/searchId/searchOk.jsp");
	}	
	
	public ModelAndView checkIdAndEmail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SellerService sellerService = new SellerServiceImpl();
		String id = request.getParameter("sellerId");
		String email = request.getParameter("sellerEmail");
		int result = sellerService.checkIdAndEmail(id, email);
		if(result==0) {
			request.setAttribute("errmsg", "������ ��ġ���� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		request.setAttribute("pwdInfo", "seller");
		request.setAttribute("searchId", id);
		return new ModelAndView("html/namdo-market/page-set-new-password.jsp");
	}

	public ModelAndView checkPwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SellerService sellerService = new SellerServiceImpl();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id + "   asf " + pwd);
		int result = sellerService.checkPwd(id, pwd);
		if(result==0) {
			request.setAttribute("errmsg", "������ ��ġ���� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		request.setAttribute("pwdInfo", "seller");
		request.setAttribute("searchId", id);
		return new ModelAndView("html/namdo-market/page-set-new-password(login).jsp");
	}
	
	public ModelAndView setPwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SellerService sellerService = new SellerServiceImpl();
		String id = request.getParameter("id");
		String pwd = request.getParameter("Pwd");
		int result = sellerService.setPwd(id, pwd);
		if(result==0) {
			request.setAttribute("errmsg", "��й�ȣ ���� ����");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
//		String pwdInfo = request.getParameter("pwdInfo");
//		if(pwdInfo.equals("seller"))
		request.setAttribute("pwdInfo", "seller");
		return new ModelAndView("html/namdo-market/searchId/pwdChangeOk.jsp");
	}	
	
}
