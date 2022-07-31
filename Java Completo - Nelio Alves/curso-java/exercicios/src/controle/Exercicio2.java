package controle;

import java.util.Scanner;

public class Exercicio2 {

	//Criar um programa informa se o ano atual é um ano bissexto;
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Insira um ano: ");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
		
		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto!");
		} else {
			System.out.println(ano + " não é um ano bissexto!");
		}
		
		entrada.close();
	}
}
