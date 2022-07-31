package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro salário: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o seu segundo salário: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o seu terceiro salário: ");
		String salario3 = entrada.next().replace(",", ".");
		
		Float valor1 = Float.parseFloat(salario1);
		Float valor2 = Float.parseFloat(salario2);
		Float valor3 = Float.parseFloat(salario3);
		
		double soma = valor1+valor2+valor3;
		double media = soma/3;
		
		System.out.println("A soma dos salários é: " + soma);
		System.out.println("A media dos salários é: " + media);
		
		entrada.close();
	}
}


/*Criar scanner que pega 3 string (nextline),
que pega os últimos 3 salarios do funcionario,
soma e divide por 3. */

