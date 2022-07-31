package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Insira o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double calculo = (base * altura)/2;
		
		System.out.printf("O resultado é: %.0f", calculo);
		
		entrada.close();		
	}
}
