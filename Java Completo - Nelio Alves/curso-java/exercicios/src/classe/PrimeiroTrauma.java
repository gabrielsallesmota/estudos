package classe;

public class PrimeiroTrauma {
	
	static int a = 3; // sem o static ele pertence a instancia.
	int b = 4; 
	public static void main(String[] args) {

		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(a);
		System.out.println(p.b);
		
		//H� duas formas: crianda um metodo, ou ent�o static na vari�vel;
		
	}
}
