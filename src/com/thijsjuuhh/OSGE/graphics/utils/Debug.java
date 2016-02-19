package com.thijsjuuhh.OSGE.graphics.utils;

public class Debug {

	private Debug() {
	}

	public static void error(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.err.println(strings[i]);
		}
	}

	public static void printErrorOnOneLine(String...strings) {
		for (int i = 0; i < strings.length; i++) {
			System.err.print(strings[i] + " ");
			if(i == strings.length - 1) System.out.println();
		}
		
	}
	
}
