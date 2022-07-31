package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Qual a quantidade de notas que você deseja inserir: ");
		
		int quantidadeNotas = entrada.nextInt();
		
		double [] notasAluno = new double [quantidadeNotas];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.printf("Insira a nota %d: ", i + 1);
			notasAluno [i] = entrada.nextInt();
		}
		
		double total = 0;
		for (double nota:notasAluno) {
			total +=nota;
		}
		
		double media = total / notasAluno.length;
		System.out.println("A média é: " + media + "!");
		
		entrada.close();
	}
}


/*
 * 
 * DESAFIO
 * Perguntar quantas notas o usuário quer informar e pedir as notas do aluno, armazena dentro do Array. 
 * Depois percorrer com foreach o Array e apresentar a média.
 * 
 */
