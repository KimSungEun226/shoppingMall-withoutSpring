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
 * �α����� �ȵǾ��ִµ�(������ �����ϴµ�) ȸ������ ���� ������ �� ���!
 */
@WebFilter(value= {"/html/namdo-market/page-cart.jsp","/html/namdo-market/page-cart-empty.jsp",
		"/html/namdo-market/page-login-security-customer.jsp","/html/namdo-market/page-login-security-seller.jsp"
		,"/html/namdo-market/page-set-new-password(login).jsp"})
public class SessionUnLoginCheckFilter implements Filter {


    public SessionUnLoginCheckFilter() {}
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//����ó��
		
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		
		if(session.getAttribute("customerDTO") ==null && session.getAttribute("sellerDTO") ==null ) {
			//������������ �̵�
			req.getRequestDispatcher("home-page.jsp").forward(request, response);
			return;//�޼ҵ带 ����������.
		}
		
		
		
		
		chain.doFilter(request, response);
		
		//����ó��
	}


}
