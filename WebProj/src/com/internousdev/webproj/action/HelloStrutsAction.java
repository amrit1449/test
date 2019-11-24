package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

/*
 * ただstrutsにSUCCESSを返すクラス
 */
public class HelloStrutsAction extends ActionSupport {
	public String execute() {
		return SUCCESS;
	}
}
