package controle;

import java.util.Scanner;

public class Exercicio5 {
	
	//Refatorar o exercício 04, utilizando a estrutura switch.
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		Scanner entrada = new  Scanner (System.in);
		
		System.out.println("Insira um número: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O número é primo!");	
			break;
		default:
			System.out.println("O número não é primo!");
		}
		
		entrada.close();
		
	}
}
