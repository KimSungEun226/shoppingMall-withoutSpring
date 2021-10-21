package ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.CustomerDTO;
import service.CustomerService;
import service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/customerNaverLoginServlet")
public class CustomerNaverLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService = new CustomerServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String naverId = request.getParameter("naverId");
		String naverEmail = " ";
		String birthyear = request.getParameter("birthyear");
		String birthday = request.getParameter("birthday");
		String contact = " ";
		
		if("undefined".equals(name)) name=" ";
		if("undefined".equals(naverEmail)) naverEmail=" ";
		if("undefined".equals(birthyear)) birthyear=" ";
		if("undefined".equals(birthday)) birthday=" ";
		if("undefined".equals(contact)) contact=" ";
		//System.out.println(name + " " + naverId + " "+ naverEmail + " "+birthyear + " " +birthday + " " + contact );
		String url="";

		HttpSession session = request.getSession();
		
		//우선 해당하는 id가 테이블에 존재하는지. 
		
		
		try {
			CustomerDTO customerDTO = customerService.loginCheck(naverId);
			
			if(customerDTO!=null) {
				//System.out.println(customerDTO);
				session.setAttribute("customerDTO", customerDTO);
			}else { //네이버 아이디로 회원가입이 안되어있는경우
				
				CustomerDTO newCustomerDTO = new CustomerDTO(naverId, " ",name, " ", naverId, " ", naverId);
				System.out.println(newCustomerDTO);
				int result = customerService.signUpCustomer(newCustomerDTO);
				
				System.out.println(result);
				if (result>0) {
					newCustomerDTO = customerService.loginCheck(naverId);
					session.setAttribute("customerDTO", newCustomerDTO);

				}
				
			}
			request.getRequestDispatcher("html/namdo-market/login/loginOk.jsp").forward(request, response);
		} catch (SQLException e) {
			System.out.println("예외발생");
			
			request.getRequestDispatcher("html/namdo-market/login/loginFail.jsp").forward(request, response);
		}
	}

}
