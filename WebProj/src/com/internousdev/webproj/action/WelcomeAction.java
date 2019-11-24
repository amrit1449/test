package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * ただSUCCESSを返すクラス
 */
public class WelcomeAction extends ActionSupport {
	public String execute() {
		return SUCCESS;
	}
}
