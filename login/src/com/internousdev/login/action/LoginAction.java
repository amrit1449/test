package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/*
 * login.jspのフォームはLoginAction.javaを呼び出している。
 * ActionSupportがstruts.xmlを呼び出し19行目以降の処理を実行している。
 * そのため、SuccessとErrorの2ファイルが必要になっている。
 */
public class LoginAction extends ActionSupport {
	private String name;
	private String password;

	// execute()メソッドなのはstruts.xmlの17行目で指定しているため。
	public String execute() throws SQLException {
		String ret = ERROR;

		// インスタンスを格納
		LoginDTO dto = new LoginDTO();
		LoginDAO dao = new LoginDAO();

		// DTOにDAOの返り値を格納。
		dto = dao.select(name, password);

		// 返り値をDTOのGetterで調べる。
		if(name.equals(dto.getName()) && password.equals(dto.getPassword())) {
			ret = SUCCESS;
		}
		return ret;
	}

	// 今回は使ってないが、実際はコレを呼び出して使う。
	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}