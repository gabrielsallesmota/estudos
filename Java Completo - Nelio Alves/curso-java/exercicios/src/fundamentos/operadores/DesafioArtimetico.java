package fundamentos.operadores;

public class DesafioArtimetico {
		
	public static void main(String[] args) {
		
		double calc1 = Math.pow(( 6*(3+2)), 2)/(3*2);
		System.out.println(calc1);
		
		double calc2 = Math.pow((((1-5)*(2-7))/2), 2);
		System.out.println(calc2);
		
		double calc3 = (Math.pow((calc1 - calc2), 3)) / (Math.pow(10, 3));
		System.out.println(calc3);

	}
}
