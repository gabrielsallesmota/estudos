package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(0)); //charAt (qual � a letra do indice)
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
 		System.out.println(s.startsWith("Boa"));
 		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length()); //quantidade de letras da String
		System.out.println(s.equals("Boa tarde!")); //compara��o
		System.out.println(s.equalsIgnoreCase("Boa tarde")); //compara��o ignorando caracter maius. e minus.
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12347.845;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + 
				"\nSalario: " + salario);
	
		System.out.printf("O Senhor %s %s tem %d e ganha R$%.2f", nome, sobrenome, idade, salario); 
		//.2 para dizer que quer 2 numero ap�s a v�rgula
		
		String frase = String.format("\nO Senhor %s %s tem %d e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //mostra se tem ou nao essas strings
		System.out.println("Frase qualquer".indexOf("qual")); //mostra em qual posi��o est�
		System.out.println("Frase qualquer".substring(6)); //apresenta o que tem ap�s a string 6
		System.out.println("Frase qualquer".substring(6,10)); //mostra o que tem entre a string 6 e 10
		
		
	
	}
}
