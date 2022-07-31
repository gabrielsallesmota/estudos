package com.projeto.condicionais;

public class Condicional {

	public static void main(String[] args) {
		
		boolean teste = false;
		int media = 9;
		//se
		if ( media < 6) {
			System.out.println ("Reprovado!");
		} else if (media >= 6 && media <= 8) { 
			System.out.println ("Aprovado!");
		} else if (media > 8 ) {
			System.out.println ("Aprovado - Exelente!");
		}

	}

}
