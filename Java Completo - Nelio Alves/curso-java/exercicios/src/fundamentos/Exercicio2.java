package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor em Celsius: ");
		double  celsius = entrada.nextDouble();
		
		double fahrenheit = ((((celsius * 9)/5))+32);
		
		System.out.printf("O valor em Fahrenheit é: %.2f", fahrenheit);
		
		entrada.close();
	}
}
