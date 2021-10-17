package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * �α����� �Ǿ��ִµ�(������ �����ϴµ�) �α���, ȸ������ ���� ������ �� ���!
 */
@WebFilter(value= {"/html/namdo-market/page-login-customer.jsp","/html/namdo-market/page-login-seller.jsp",
		"/html/namdo-market/page-search-id-seller.jsp","/html/namdo-market/page-search-id-customer.jsp",
		"/html/namdo-market/page-signup-customer.jsp","/html/namdo-market/page-signup-seller.jsp"
		,"/html/namdo-market/page-set-new-password.jsp"})
public class SessionLoginCheckFilter implements Filter {


    public SessionLoginCheckFilter() {}
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//����ó��
		
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		
		if(session.getAttribute("customerDTO") !=null || session.getAttribute("sellerDTO") !=null || session.getAttribute("adminDTO") !=null ) {
			//������������ �̵�
			req.getRequestDispatcher("home-page.jsp").forward(request, response);
			return;//�޼ҵ带 ����������.
		}
		
		
		
		
		chain.doFilter(request, response);
		
		//����ó��
	}


}
