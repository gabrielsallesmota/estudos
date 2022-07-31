package fundamentos.operadores;

public class Aritmeticos {
	public static void main(String[] args) {
		
		System.out.println(2+3);
		
		var x = 34.56;
		double y = 24.66;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + (double)b); //para que o resultado n�o sera um numero inteiro (cast)
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		//M�dulo > Resto da Divis�o
		
		System.out.println(a%b);
		System.out.println(8%3);
	}
}
