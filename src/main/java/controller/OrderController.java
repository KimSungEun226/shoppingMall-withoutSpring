package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.CartDTO;
import dto.CustomerDTO;
import dto.ItemDTO;
import dto.OrderDTO;
import dto.OrderDetailDTO;
import service.CartService;
import service.CartServiceImpl;
import service.OrderService;
import service.OrderServiceImpl;

public class OrderController implements Controller {
    private CartService cartService = new CartServiceImpl();
    private OrderService orderService = new OrderServiceImpl();
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ModelAndView addOrder(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String addr;
		HttpSession session = request.getSession();
		
		CustomerDTO dto = (CustomerDTO)session.getAttribute("customerDTO");
		
		
		int customerNo = dto.getCustomerNo();
		int total = Integer.parseInt(request.getParameter("amount"));
		List<CartDTO> cartList = cartService.selectCartByCustomerNo(customerNo);
		
		//�ּҼ���
		if(request.getParameter("addrInput2").equals("") || request.getParameter("addrInput2")==null ) addr = request.getParameter("addrInput1");
		else addr = request.getParameter("addrInput2") + " " + request.getParameter("detailAddrInput");
		
		
		//1�̸� �ֹ�����, 0�̸� ����
		int result = orderService.orderItems(new OrderDTO(customerNo, addr, "�����", total), cartList);
		
		if(result ==0) {
			request.setAttribute("errmsg", "�ֹ�����!!!");
			return new ModelAndView("html/namdo-market/error/error.jsp");
		}
		else return new ModelAndView("html/namdo-market/order/orderOk.jsp");

	}

	
	/**
	 * ��ǰ�� ������ �ֹ� �� ���� 
	 * */
	public ModelAndView selectOrderDetailByItemNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	int itemNo =  Integer.parseInt(request.getParameter("itemNo"));
    	List<OrderDetailDTO> orderList = orderService.selectOrderDetailByItemNo(itemNo);
    	System.out.println("������ ����: " + orderList.size());
    	request.setAttribute("sellingList", orderList);
    	return new ModelAndView("html/namdo-market/page-sold-item-detail.jsp");
    }
	
	
	/**
	 * ��ǰ�� ������ �ֹ� ���� 
	 * */
	public ModelAndView selectOrderByItemNo(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	int itemNo =  Integer.parseInt(request.getParameter("itemNo"));
    	List<OrderDTO> orderList = orderService.selectOrderByItemNo(itemNo);
    	request.setAttribute("sellingList", orderList);
    	return new ModelAndView("html/namdo-market/page-sold-item-detail.jsp");
    }
}
