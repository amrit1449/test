import java.io.IOException;
import java.io.PrintWriter;		// 受け取り値の出力
import java.sql.Connection;		// 接続
import java.sql.DriverManager;	// ドライバ管理
import java.sql.ResultSet;		// 結果格納
import java.sql.SQLException;	// 例外処理
import java.sql.Statement;		// 状態管理

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MySQLServlet")
public class MySQLServlet extends HttpServlet {

    public MySQLServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		out.println("<HTML><HEAD><TITLE>データベース接続テスト</TITLE></HEAD><BODY>");

		// 接続準備
		Connection con = null;
		String url = "jdbc:mysql://localhost/testdb";
		String user = "root";
		String password = "mysql";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, user, password);

			// 接続とSQL実行
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM test_table";
			ResultSet rs = stmt.executeQuery(sql);

			// 結果出力
			while(rs.next()) {
				int userId = rs.getInt("user_id");
				String userName = rs.getString("user_name");
				String userPassword = rs.getString("password");
				out.println("<p>ユーザーID：" + userId + ", ユーザー名：" + userName + ", パスワード：" + userPassword + "</p>");
			}

			// 接続解除
			rs.close();
			stmt.close();
		} catch(ClassNotFoundException e) {
			// ドライバが見つからなかったとき
			out.println("ClassNotFoundException：" + e.getMessage());
		} catch(SQLException e) {
			// MySQLに接続できなかったとき
			out.println("SQLException：" + e.getMessage());
		} catch(Exception e) {
			// 実行エラーになったとき
			out.println("Exception：" + e.getMessage());
		} finally {
			// SQL切断
			try {
				if(con != null) {
					con.close();
				}
			} catch(SQLException e) {
				out.println("SQLException：" + e.getMessage());
			}
		}
		out.println("</BODY></HTML>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
