import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	// JDBCのドライバ名
	private static String driverName = "com.mysql.jdbc.Driver";

	// MySQLのURL指定
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	// アカウント名とパスワード
	private static String user = "root";
	private static String password = "mysql";

	// 接続状態にする関数
	public Connection getConnection() {
		// 初期化
		Connection con = null;

		// 例外処理
		try {
			// ドライバの読み込みと接続
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			// クラス例外
			e.printStackTrace();
		} catch(SQLException e) {
			// SQL例外
			e.printStackTrace();
		}
		return con;
	}
}
