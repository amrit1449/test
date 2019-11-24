package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String password;

	/*
	 * Getter関数
	 * Actionから呼び出される
	 */
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	/*
	 * Setter関数
	 * DAOから呼び出されてDTOに格納
	 */
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}