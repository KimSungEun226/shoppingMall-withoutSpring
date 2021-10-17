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
@WebServlet("/idCheck")
public class IdCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IdCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//�Ѿ�� id�ޱ�
		String id = request.getParameter("id");
		String info = request.getParameter("info");
		
		if (info.equals("customer")) { 
			CustomerService customerService = new CustomerServiceImpl();
			PrintWriter out = response.getWriter();
			try {
				if(customerService.idCheck(id) || !isValidId(id) ) {
					out.print("���Ұ���");
				}else {
					out.print("��밡���մϴ�.");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			SellerService sellerService = new SellerServiceImpl();
			PrintWriter out = response.getWriter();
			try {
				if(sellerService.idCheck(id) || !isValidId(id) ) {
					out.print("���Ұ���");
				}else {
					out.print("��밡���մϴ�.");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
	public static boolean isValidId(String id) {
        if (id==null) return false;
        boolean b = Pattern.matches("^[a-zA-Z]{1}[a-zA-Z0-9_]{3,15}$",id.trim());
        return b;
    }
}
