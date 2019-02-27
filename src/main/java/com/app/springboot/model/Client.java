package com.app.springboot.model;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	private int clientId;
	private String clientName;
	private String passwordTxt;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPasswordTxt() {
		return passwordTxt;
	}

	public void setPasswordTxt(String passwordTxt) {
		this.passwordTxt = passwordTxt;
	}
}