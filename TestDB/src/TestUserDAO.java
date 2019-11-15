import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// プログラム側
public class TestUserDAO {

	// 検索したいユーザ名とパスワード
	String name = "";
	String password = "";

	// ここからSQL処理(代入値はTest.javaから取ってくる)

	// 名前とパスワードからデータを取ってくる
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

	// 全件取得
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

	// 名前から取得
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

	// パスワードから取得
	public void selectByPassword(String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM test_table where password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, password);
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

	// 名前を更新
	public void updateUserNameByUserName(String oldName, String newName) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE test_table SET user_name=? where user_name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, newName);
			ps.setString(2, oldName);

			// 挿入・削除・更新は返り値が該当数なのでINT型を使う。
			// 逆に検索はオブジェクトで返すのでResultSetを使う。
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件更新されました");
			} else {
				System.out.println("該当するデータがありませんでした");
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

	// データ追加
	public void insert(int user_id, String name, String password) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO test_table VALUES(?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, user_id);
			ps.setString(2, name);
			ps.setString(3, password);

			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件登録されました");
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

	// データ削除
	public void delete(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM test_table WHERE user_name=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println(i + "件削除されました");
			} else {
				System.out.println("該当するデータは存在しませんでした");
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