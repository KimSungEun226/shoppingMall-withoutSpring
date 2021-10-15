package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import service.CustomerService;
import service.CustomerServiceImpl;



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
		CustomerService customerService = new CustomerServiceImpl();
		PrintWriter out = response.getWriter();
		try {
			if(customerService.idCheck(id)) {
				out.print("�ߺ��Դϴ�.");
			}else {
				out.print("��밡���մϴ�.");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
