package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.SellerDTO;
import service.SellerService;
import service.SellerServiceImpl;

/**
 * Servlet implementation class CustomerLoginServlet
 */
@WebServlet("/sellerLoginServlet")
public class SellerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SellerService sellerService = new SellerServiceImpl();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sellerId = request.getParameter("sellerId");
		String pwd = request.getParameter("sellerPwd");
		String url="";
		try {
			
			System.out.println(pwd);
			SellerDTO sellerDTO = sellerService.loginCheck(new SellerDTO(sellerId, pwd));
			//여기까지 왔다는 이야기는 예외없이 정상이므로 session에 정보를 저장한다.
			HttpSession session = request.getSession();
			
			if(sellerDTO!=null) {
				System.out.println("userID : " + sellerDTO.getSellerId());
				session.setAttribute("sellerDTO", sellerDTO);
				url = "home-page.jsp";
			}
			PrintWriter out = response.getWriter();
	        out.print(url);
		} catch (Exception e) {
			System.out.println();
			PrintWriter out = response.getWriter();
	        out.print(url);
		}
	}

}
