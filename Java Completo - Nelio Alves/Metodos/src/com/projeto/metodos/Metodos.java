package com.projeto.metodos;

public class Metodos {

	public static void main (String [] args) {
		
		int resultado;
		resultado = multiplicar (2,5);
		System.out.println (resultado);
		
	}
	
	
	public static int multiplicar (int numero1, int numero2) {
		int resultado = 0;
		
		resultado = numero1 * numero2;
		return resultado;
	}
	
 }

//Exibiu na tela: 12