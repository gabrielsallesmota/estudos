package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;
		final double Pi = 3.14159;
		
		System.out.println(Pi*raio*raio); 
		
		raio=10;
		System.out.println("Área = " + Pi*raio*raio + " m²");
	}
}
