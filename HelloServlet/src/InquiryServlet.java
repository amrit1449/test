import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InquiryServlet
 */
@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {

    public InquiryServlet() {
        super();
    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//
//	}

    // ここから出力処理
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD><BODY>" + name + "さん、お問い合わせありがとうございました。</BODY></HTML>");
	}

}
