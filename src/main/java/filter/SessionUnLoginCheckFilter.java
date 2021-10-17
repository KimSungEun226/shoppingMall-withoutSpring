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
 * 로그인이 안되어있는데(세션이 존재하는데) 회원정보 관련 페이지 들어갈 경우!
 */
@WebFilter(value= {"/html/namdo-market/page-cart.jsp","/html/namdo-market/page-cart-empty.jsp",
		"/html/namdo-market/page-login-security-customer.jsp","/html/namdo-market/page-login-security-seller.jsp"
		,"/html/namdo-market/page-set-new-password(login).jsp"})
public class SessionUnLoginCheckFilter implements Filter {


    public SessionUnLoginCheckFilter() {}
    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//사전처리
		
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpSession session = req.getSession();
		
		
		if(session.getAttribute("customerDTO") ==null && session.getAttribute("sellerDTO") ==null ) {
			//에러페이지로 이동
			req.getRequestDispatcher("home-page.jsp").forward(request, response);
			return;//메소드를 빠져나가라.
		}
		
		
		
		
		chain.doFilter(request, response);
		
		//사후처리
	}


}
