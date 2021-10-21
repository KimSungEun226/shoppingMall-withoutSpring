package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDetailDTO;
import dto.OrderViewDTO;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;


public class CustomerController implements Controller{
	
	private CustomerService customerService = new CustomerServiceImpl();
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//ajax�� �����ϴ�.
//	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String customerId = request.getParameter("customerId");
//		String pwd = request.getParameter("customerPwd");
//		
//		CustomerDTO customerDTO = customerService.loginCheck(new CustomerDTO(customerId, pwd));
//		
//		//������� �Դٴ� �̾߱�� ���ܾ��� �����̹Ƿ� session�� ������ �����Ѵ�.
//		HttpSession session = request.getSession();
//		session.setAttribute("customerDTO", customerDTO);
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
		String customerId = request.getParameter("customerId");
		String customerPwd = request.getParameter("customerPwd");
		String customerName = request.getParameter("customerName");
		String customerBirth = request.getParameter("customerYear") + "-" + request.getParameter("customerMonth").substring(0, request.getParameter("customerMonth").length()-1) +"-" + request.getParameter("customerDay"); 
		String customerEmail = request.getParameter("customerEmail");
		String customerAddr = request.getParameter("customerAddr")+" "+request.getParameter("customerDetailAddr");
		String customerContact = request.getParameter("customerContact");
		
		
		System.out.println(customerId +" "+ customerPwd +" "+ customerBirth +" "+ customerEmail +" "+ customerAddr +" "+ customerContact);
		
		CustomerDTO customerDTO = new CustomerDTO(customerId, customerPwd, customerName, customerBirth, customerEmail, customerAddr, customerContact);
		int result = customerService.signUpCustomer(customerDTO);
		
		if(result ==0) {
			request.setAttribute("errmsg", "��Ͻ����Դϴٸ�");
			return new ModelAndView("html/namdo-market/error/error.jsp");
			}
		return new ModelAndView("html/namdo-market/signUp/signUpOk.jsp", true);
	}
	
	public ModelAndView searchIdCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("customerName");
		String email = request.getParameter("customerEmail");
		String result = customerService.searchIdCustomer(name, email);
		
		if(result==null) {
			request.setAttribute("errmsg", "��ġ�ϴ� ������ ID�� �������� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		
		request.setAttribute("searchId", result);
		request.setAttribute("info", "customer");
		return new ModelAndView("html/namdo-market/searchId/searchOk.jsp");
	}	
	
	public ModelAndView checkIdAndEmail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("customerId");
		String email = request.getParameter("customerEmail");
		int result = customerService.checkIdAndEmail(id, email);
		if(result==0) {
			request.setAttribute("errmsg", "������ ��ġ���� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		request.setAttribute("pwdInfo", "customer");
		request.setAttribute("searchId", id);
		return new ModelAndView("html/namdo-market/page-set-new-password.jsp");
	}	
	
	public ModelAndView checkPwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id + " " + pwd);
		int result = customerService.checkPwd(id, pwd);
		if(result==0) {
			request.setAttribute("errmsg", "������ ��ġ���� �ʽ��ϴ�.");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
		request.setAttribute("pwdInfo", "customer");
		request.setAttribute("searchId", id);
		return new ModelAndView("html/namdo-market/page-set-new-password(login).jsp");
	}
	
	
	public ModelAndView setPwd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id = request.getParameter("id");
		String pwd = request.getParameter("Pwd");
		System.out.println(id + " " + pwd);

		int result = customerService.setPwd(id, pwd);
		if(result==0) {
			request.setAttribute("errmsg", "��й�ȣ ���� ����");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		
//		String pwdInfo = request.getParameter("pwdInfo");
//		if(pwdInfo.equals("seller"))
		request.setAttribute("pwdInfo", "customer");
		return new ModelAndView("html/namdo-market/searchId/pwdChangeOk.jsp");
	}	
	
	
	
	public ModelAndView selectOrderDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		
		CustomerDTO customerDTO = (CustomerDTO)session.getAttribute("customerDTO");
		int customerNo = customerDTO.getCustomerNo();
		
        List<OrderDetailDTO> result = customerService.selectOrderDetailByCustomerNo(customerNo);
        ItemService itemService = new ItemServiceImpl();
        
        List<OrderViewDTO> list = new ArrayList<OrderViewDTO>();
        
        for(OrderDetailDTO dto : result) {
        	ItemDTO item = itemService.selectByNo(dto.getItemNo());
        	OrderViewDTO orderViewDTO = new OrderViewDTO(item.getItemNo(),item.getItemName(), item.getItemPrice(), dto.getOrderItemCount(), dto.getOrderDate() ,dto.getOrderStatus(), item.getMainImg());
        	list.add(orderViewDTO);
        }
		
        if(list.size()==0) list =null;
        request.setAttribute("list", list);
        
        
		return new ModelAndView("html/namdo-market/page-orders.jsp");
	}	
	
}
