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
@WebServlet("/businessNoCheck")
public class businessNoCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public businessNoCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		//넘어온 id받기
		int businessNo = Integer.parseInt(request.getParameter("businessNo"));
		
 
		SellerService sellerService = new SellerServiceImpl();
		PrintWriter out = response.getWriter();
		try {
			if(sellerService.businessNoCheck(businessNo) || !isValidBusinessNo(businessNo)) {
				out.print("사용불가능");
			}else {
				out.print("사용가능합니다.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
    
	public static boolean isValidBusinessNo(int businessNo) {
		if (String.valueOf(businessNo)==null) return false;
        boolean b = Pattern.matches("^[0-9]{10,11}$",String.valueOf(businessNo).trim());
        return b;
    }
}
