package fundamentos.operadores;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		//Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) 
		//utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira o valor de a: ");
		double a = entrada.nextDouble();

		System.out.println("Insira o valor de b: ");
		double b = entrada.nextDouble();

		System.out.println("Insira o valor de c: ");
		double c = entrada.nextDouble();
		
		double calculoDelta = ((b * b)-4*a*c);
		
		double calculoX1 = ((-b+(Math.sqrt(calculoDelta)))/(2*a));
		double calculoX2 = ((-b-(Math.sqrt(calculoDelta)))/(2*a));
		
		System.out.printf("O valor de Delta é: %.2f. E os valores de X1 é: %.2f e X2 é: %.2f", calculoDelta, calculoX1, calculoX2);
		
		entrada.close();
		
	}
}
