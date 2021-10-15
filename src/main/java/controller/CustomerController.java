package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.CustomerDTO;
import service.CustomerService;
import service.CustomerServiceImpl;


public class CustomerController implements Controller{
	
	private CustomerService customerService = new CustomerServiceImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//ajax로 했읍니다.
//	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String customerId = request.getParameter("customerId");
//		String pwd = request.getParameter("customerPwd");
//		
//		CustomerDTO customerDTO = customerService.loginCheck(new CustomerDTO(customerId, pwd));
//		
//		//여기까지 왔다는 이야기는 예외없이 정상이므로 session에 정보를 저장한다.
//		HttpSession session = request.getSession();
//		session.setAttribute("customerDTO", customerDTO);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("home-page.jsp");
//		
//		//뽀워드는 리퀘스트만 유지된다.(세션은 redirect여도 유지)
//		mv.setRedirect(true);
//		
//		return mv;
//	}
	
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return new ModelAndView("home-page.jsp", true);
	}
    
	
	
	public ModelAndView signUp(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CustomerService customerService = new CustomerServiceImpl();
		String customerId = request.getParameter("customerId");
		String customerPwd = request.getParameter("customerPwd");
		String customerName = request.getParameter("customerName");
		String customerBirth = request.getParameter("customerYear") + "-" + request.getParameter("customerMonth").substring(0, request.getParameter("customerMonth").length()-1) +"-" + request.getParameter("customerDay"); 
		String customerEmail = request.getParameter("customerEmail");
		String customerAddr = request.getParameter("customerAddr")+request.getParameter("customerDetailAddr");
		String customerContact = request.getParameter("customerContact");
		
		
		System.out.println(customerId +" "+ customerPwd +" "+ customerBirth +" "+ customerEmail +" "+ customerAddr +" "+ customerContact);
		
		CustomerDTO customerDTO = new CustomerDTO(customerId, customerPwd, customerName, customerBirth, customerEmail, customerAddr, customerContact);
		int result = customerService.signUpCustomer(customerDTO);
		
		if(result ==0) {
			request.setAttribute("errmsg", "등록실패입니다만");
			return new ModelAndView("error.jsp");
			}
		return new ModelAndView("home-page.jsp", true);
	}
	
	public ModelAndView searchIdCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CustomerService customerService = new CustomerServiceImpl();
		String name = request.getParameter("customerName");
		String email = request.getParameter("customerEmail");
		String result = customerService.searchIdCustomer(name, email);
		
		if(result==null) {
			request.setAttribute("errmsg", "일치하는 정보의 ID가 존재하지 않습니다.");
			return new ModelAndView("error.jsp");
		}
		
		
		request.setAttribute("searchId", result);
		return new ModelAndView("searchId/searchOk.jsp");
	}	
	
	public ModelAndView checkIdAndEmail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		CustomerService customerService = new CustomerServiceImpl();
		String id = request.getParameter("customerId");
		String email = request.getParameter("customerEmail");
		int result = customerService.checkIdAndEmail(id, email);
		System.out.println(result);
		if(result==0) {
			request.setAttribute("errmsg", "정보가 일치하지 않습니다.");
			return new ModelAndView("error.jsp");
		}
		
		
		request.setAttribute("searchId", id);
		return new ModelAndView("page-set-new-password.jsp");
	}	
	

}
