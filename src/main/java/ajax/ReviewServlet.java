package ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ReviewDTO;
import net.sf.json.JSONArray;
import service.ReviewService;
import service.ReviewServiceImpl;

/**
 * Servlet implementation class reviewServlet
 */
@WebServlet("/reviewServlet")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ReviewService reviewService = new ReviewServiceImpl();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		int itemNo = Integer.parseInt(request.getParameter("itemNo"));
		
		try {
			System.out.println(itemNo);
			List<ReviewDTO> reviewList = reviewService.reviewSelectByItemNo(itemNo);
			System.out.println(reviewList);
			
			if(reviewList.isEmpty()) {
				System.out.println("리뷰가 아직 없습니다.");
			}

			request.setAttribute("list", reviewList);
			JSONArray arr = JSONArray.fromObject(reviewList);
			
			PrintWriter out = response.getWriter();
			out.print(arr);

		} catch (Exception e) {
			System.out.println("에러");
			e.printStackTrace();
		}
		
	}

}
