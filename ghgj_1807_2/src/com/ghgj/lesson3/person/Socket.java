package com.ghgj.lesson3.person;

public class Socket {
	private String id;
	private String pwd;
	private String email;
	
	public Socket (String id,String pwd,String email) {
		this.id = id;
		this.pwd =pwd;
		this.email = email;
	}
	
	public Socket (String id,String pwd) {
		this.id = id;
		this.pwd =pwd;
		this.email = id+"@163.com";
	}
	
	public Socket() {
		
	}
	
	public String show() {
		return "ID  "+id+"  √‹¬Î £∫ "+pwd+"  email£∫ "+email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
