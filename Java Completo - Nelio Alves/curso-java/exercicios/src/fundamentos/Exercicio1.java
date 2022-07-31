package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (((fahrenheit-32)/9)*5);
		
		System.out.printf("O valor em Celsius é: %.2f", celsius);
		
		entrada.close();
	}
}
