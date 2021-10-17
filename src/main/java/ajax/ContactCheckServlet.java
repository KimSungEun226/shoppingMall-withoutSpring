package ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomerService;
import service.CustomerServiceImpl;
import service.SellerService;
import service.SellerServiceImpl;



/**
 * Servlet implementation class IdCheckServlet
 */
@WebServlet("/contactCheck")
public class ContactCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//넘어온 id받기
		String contact = request.getParameter("contact");
		String info = request.getParameter("info");
		
		
		if("customer".equals(info)) {
			try {
				CustomerService customerService = new CustomerServiceImpl();
				PrintWriter out = response.getWriter();
				if(customerService.contactCheck(contact) || !isValidContact(contact)) {
					out.print("사용불가능");
				}else {
					out.print("사용가능합니다.");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				SellerService sellerService = new SellerServiceImpl();
				PrintWriter out = response.getWriter();
				if(sellerService.contactCheck(contact) || !isValidContact(contact)) {
					out.print("사용불가능");
				}else {
					out.print("사용가능합니다.");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}			
		}
	}
	
	public static boolean isValidContact(String contact) {
        if (contact==null) return false;
        boolean b = Pattern.matches("^굚d{3}-굚d{3,4}-굚d{4}$",contact.trim());
        return b;
    }	

}
