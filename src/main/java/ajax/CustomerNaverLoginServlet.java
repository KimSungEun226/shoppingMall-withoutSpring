package ajax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.JSONParser;

import net.sf.json.JSONObject;
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
		
		
//		String customerId = request.getParameter("customerId");
//		String pwd = request.getParameter("customerPwd");
//		String url="";
//		HttpSession session = request.getSession();
//		
//		if("admin".equals(customerId) && "rhksflwk".equals(pwd)) {
//			session.setAttribute("adminDTO", "adminDTO");
//			url = "home-page.jsp";
//			PrintWriter out = response.getWriter();
//	        out.print(url);
//	        return;
//		}
//		
//		try {
//			
//			System.out.println(pwd);
//			CustomerDTO customerDTO = customerService.loginCheck(new CustomerDTO(customerId, pwd));
//			//여기까지 왔다는 이야기는 예외없이 정상이므로 session에 정보를 저장한다.
//			
//			
//			if(customerDTO!=null) {
//				System.out.println("userID : " + customerDTO.getCustomerId());
//				session.setAttribute("customerDTO", customerDTO);
//				url = "home-page.jsp";
//				//url = "login/loginOk.jsp";
//			}
//			PrintWriter out = response.getWriter();
//	        out.print(url);
//		} catch (Exception e) {
//			System.out.println();
//			PrintWriter out = response.getWriter();
//	        out.print(url);
//		}
	}

}
