package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * ログインして入力値を返すクラス
 */
public class LoginAction extends ActionSupport {
	private String username;
	private String password;

	public String execute() {
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
