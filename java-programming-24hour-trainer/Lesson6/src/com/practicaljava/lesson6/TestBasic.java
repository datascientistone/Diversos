package com.practicaljava.lesson6;

public class TestBasic {
	
	final int MINHA_CONSTANTE;
	
	public TestBasic() {
		// MINHA_CONSTANTE = 4; // erro de compilação
		MINHA_CONSTANTE = 4;
	}
	
	static public void doLocalFinal() {
		final int CONSTANTE_LOCAL = 4;
		System.out.println(CONSTANTE_LOCAL);
		
		MinhaImplementacao mi = new MinhaImplementacao();
		if (mi instanceof MinhaInterface) {
			System.out.println("implementa a interface");
		}
		
	}
}
