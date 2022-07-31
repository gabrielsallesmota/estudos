package controle;

public class DesafioFor {

//Desafio -> nao pode usar valor numerico pra controlar o laço!!
	
	public static void main(String[] args) {
		
		for (String valor = "#"; !valor.equals("######"); valor += "#") {
			System.out.println(valor);
		}	
	}
}

