import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    public TestServlet() {
        super();
    }

    // GET通信
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println(user_name);
		System.out.println(password);

		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD><BODY>" + user_name + "：" + password + "</BODY></HTML>");
	}

	// POST通信
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		String user_name = request.getParameter("user_name");
		String password = request.getParameter("password");
		System.out.println(user_name);
		System.out.println(password);

		PrintWriter out = response.getWriter();
		out.println("<HTML><HEAD></HEAD><BODY>" + user_name + "：" + password + "</BODY></HTML>");
	}

}
