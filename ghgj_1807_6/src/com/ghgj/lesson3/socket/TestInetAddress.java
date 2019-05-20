package com.ghgj.lesson3.socket;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(Inet4Address.getLocalHost());
		
		System.out.println(Inet4Address.getByName("chen"));
		System.out.println(Inet4Address.getLocalHost().getHostName());
		System.out.println(Inet4Address.getLocalHost().getHostAddress());
	}
}
