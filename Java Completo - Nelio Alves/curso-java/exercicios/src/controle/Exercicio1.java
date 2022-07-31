package controle;

import java.util.Scanner;

public class Exercicio1 {
	
	//Criar um programa que receba um numero e verifique se ele está entre 0 e 10 e é par;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira um valor para saber se é par ou impar: ");
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("O valor digitado é par!");
		} else {
			System.out.println("O valor digitado é impar!");
		}
		
		entrada.close();
		
	}
}
