package com.bt.general;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome1 to ANT 2111111 !! " + getLocalCurrentDate());
	}

	private static Date getLocalCurrentDate() {
		return new Date();
	}

}
