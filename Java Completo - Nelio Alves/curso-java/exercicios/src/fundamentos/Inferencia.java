package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		double d; //variável foi declarada
		d = 123.65; //variável iniciada
		System.out.println(d); //usada!
		
		/* var e;
		e = 123.45; 
		resultado da erro pois foi utilizado 'var' */
		
		//quando utiliza-se 'var', o proprio Java identifica o tipo de variável utilizado.
	}
}
