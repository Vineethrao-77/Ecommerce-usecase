package com.learn.training.user.model;

public class LoginUser {

    private String userName;
    private String password;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public LoginUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LoginUser() {
		super();
	}
    
}
