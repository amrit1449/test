package com.internousdev.login.util;

// SQL関係のパッケージ
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	// ドライバやURLの指定
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql//localhost/logindb_ohki";

	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection() {
		Connection con = null;

		// 接続処理
		try {
			Class.forName(driverName);
			con = (Connection)DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}

		return con;
	}
}
