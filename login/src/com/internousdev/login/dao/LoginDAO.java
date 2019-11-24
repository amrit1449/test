package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {
	// name, passwordかエラー文をDTOに返す関数
	public LoginDTO select(String name, String password) throws SQLException {
		// DTOクラスを格納
		LoginDTO dto = new LoginDTO();

		// DB接続
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		// SQL実行
		String sql = "SELECT * FROM user WHERE user_name=? and password=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			// 結果をDAOに格納
			if(rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return dto;
	}
}