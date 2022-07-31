package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); //funcionalidade para igualar Strings
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println(s2);
		System.out.println("2" == s2);
		System.out.println("2".contentEquals(s2.trim())); //a função trim e para ignorar os espaços
		
		entrada.close ();
	}
}			
