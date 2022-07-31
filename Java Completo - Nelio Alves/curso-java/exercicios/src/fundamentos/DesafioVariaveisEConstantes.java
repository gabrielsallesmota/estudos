package fundamentos;

public class DesafioVariaveisEConstantes {
	
	public static void main(String[] args) {
		//(°F - 32) x 5/9 = °C
		double fahrenheit = 86;
		
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		System.out.println("O resultado é: " + (((fahrenheit - ajuste) * fator)) + "°C");
	}
}
