package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		boolean criterioReprovacao = media < 4.5;
		boolean criterioRecuperacao = media >= 4.5 && media < 7.0;
		boolean criterioAprovacao = media >= 7.0;
		
		if (criterioAprovacao) {
			System.out.println("O aluno foi aprovado!");
		} else if (criterioRecuperacao) { 
			System.out.println("O aluno está de recuperação!");
		} else if (criterioReprovacao) {
			System.out.println("O aluno foi reprovado!");
		}
		
		entrada.close();
	}
}
