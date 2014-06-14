package com.practicaljava.lesson5;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicTest {
	public static void doBasicArray() {
		String[] array1 = new String[1];
		array1[0] = "abc";
		
		int[][] array2 = new int[1][1];
		array2[0][0] = 1;
	}
	
	public static void doBasicLoop() {
		for (int i = 0; i < 1; i++) {
			continue;
		}
		
		while(true){
			break;
		}
		
		do {
			// ..
		} while (false);
	}
	
	public static void doBasicLog() throws SecurityException, IOException {
		Logger logger = Logger.getLogger(BasicTest.class.getName());
		
		FileHandler logHandler = new FileHandler("log.txt");
		logger.setLevel(Level.ALL);
		logger.addHandler(logHandler);
		
		logger.severe("critico");
		logger.info("info");
		logger.fine("ok");
	}
	
	public static void doBasicIf() {
		int valor = 1;
		if (valor == 1) {
			// ...
		} else if (valor == 2 || valor == 3 && valor != 4) {
			// ..
		} else {
			// ....
			int a = 2;
			boolean resultado = a == 0 ? true : false;
			System.out.println(resultado);
		}
	}
	
	public static void doBasicSwitch() {
		int valor = 2;
		switch (valor) {
		case 1:
			System.out.println("um a cinco");
			break;
		case 2:
		case 3:
			// ..
			break;
		default:
			break;
		}
		
		
		String texto = "abc";
		switch (texto) {
		case "a":
			// ..
			break;
		case "A":
			break;
		

		default:
			break;
		}
	}
}
