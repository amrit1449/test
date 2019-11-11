import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestUserDAO {

	// 検索したいユーザ名とパスワード
	String name = "";
	String password = "";

	// ここからSQL処理(代入値はTest.javaから取ってくる)
	public void select(String name, String password) {
		// pdo = new PDOと同じ
		DBConnector db = new DBConnector();

		// 接続
		Connection con = db.getConnection();


		// プレースホルダで予約
		String sql = "SELECT * FROM test_table WHERE user_name=? AND password=?";

		try {
			// prepareして
			PreparedStatement ps = con.prepareStatement(sql);

			// プレースホルダにセットして(型指定は要らない？)
			ps.setString(1, name);
			ps.setString(2, password);

			// executeで実行しstmtに結果を返す
			ResultSet rs = ps.executeQuery();

			// whileやforeachで回している感じ
			if(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch(SQLException e) {
			// クエリエラー
			e.printStackTrace();
		}

		try {
			// 切断
			con.close();
		} catch(SQLException e) {
			// DBエラー
			e.printStackTrace();
		}
	}

	public void selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT *  FROM test_table";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table WHERE user_name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}

		try {
			con.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}