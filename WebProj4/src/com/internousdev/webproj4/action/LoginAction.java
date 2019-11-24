package com.internousdev.webproj4.action;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.webproj4.dao.LoginDAO;
import com.internousdev.webproj4.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private List<LoginDTO> LoginDTOList = new ArrayList<LoginDTO>();

	public String execute() {
		String ret = ERROR;
		LoginDAO dao = new LoginDAO();
		LoginDTOList = dao.select(username, password);

		if(this.username.equals(LoginDTOList.get(0).getUsername()) && this.password.equals(LoginDTOList.get(0).getPassword())) {
			ret = SUCCESS;
		} else {
			ret = ERROR;
		}

		return ret;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public List<LoginDTO> getLoginDTOList() {
		return LoginDTOList;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLoginDTOList(List<LoginDTO> loginDTOList) {
		LoginDTOList = loginDTOList;
	}
}
