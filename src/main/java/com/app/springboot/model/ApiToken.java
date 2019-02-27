package com.app.springboot.model;

import java.io.Serializable;

public class ApiToken implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;

	public ApiToken(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
