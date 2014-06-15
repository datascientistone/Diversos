package com.practicaljava.lesson13;

import java.io.File;
import java.io.IOException;

public class TestStackTrace {

	public TestStackTrace() throws IOException {
		divideByZero();
		doException();
	}
	
	private int divideByZero() {
		return 25 / 0;
	}

	public static void main(String[] args) {
		try {
			new TestStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doException() throws IOException {
	}

}
