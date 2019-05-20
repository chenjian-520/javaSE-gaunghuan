package com.ghgj.lesson1.shop;

public class AdmiUser {

	private String number;
	private String code;

	public AdmiUser() {

	}

	public AdmiUser(String number, String code) {
		this.number = number;
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number, String code) {
		this.number = number;
		this.code = code;

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean login(String nu, String cd) {
		if (nu.equals(this.number) && cd.equals(this.code)) {
			return true;
		} else {
			return false;
		}
	}
}
