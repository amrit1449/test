package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 作ったクラスを挿入する
import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;

public class LoginDAO {

	public LoginDTO select(String name, String password) throws SQLException {

		// SQL接続文
		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		// SQLコマンド
		String sql = "SELECT * FROM user where user_name=? AND password=?";

		try {
			// SQL実行
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			// 結果をdtoの各関数に返す
			if(rs.next()) {
				dto.setName(rs.getString("user_name"));
				dto.setPassword(rs.getString("password"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}

		// DTOを返す
		return dto;
	}

}
