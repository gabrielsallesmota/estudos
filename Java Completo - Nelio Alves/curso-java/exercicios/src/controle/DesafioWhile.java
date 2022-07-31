package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double contadorNota = 0;
		double contador = 0;
		double nota = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota de 0 a 10 (ou -1 para sair):");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10){
				contadorNota += nota;
				contador = contador + 1;
			} else {
				System.out.println("Digite uma nota válida");
			}
		}
		
		//Calculo Média
		double media = contadorNota / contador;
		
		System.out.printf("O aluno tem um total de %.2f pontos", contadorNota);
		System.out.printf("\nForam inseridas %.0f notas", contador);
		System.out.printf("\nA média do aluno foi %.2f pontos", media);
		
		entrada.close();
		
	}
	
}


/*Desafio:

Usuário digita nota valida (0 a 10) -> armazena numa variavel chamada total
Outra variavel para definir quantas notas validas foram digitadas. -> 
quanto digitar -10, para o programa.

*/