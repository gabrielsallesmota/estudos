package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	
	//Criar um programa que leia o peso e a altura do usu�rio e imprima no console o IMC.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Insira a sua altura em cent�metros: ");
		double altura = entrada.nextDouble();
		
		double calculo = (peso / ((altura/100) * (altura/100)));	
		
		System.out.printf("O seu IMC �: %.1f", calculo);
		
		entrada.close();
	}
}
