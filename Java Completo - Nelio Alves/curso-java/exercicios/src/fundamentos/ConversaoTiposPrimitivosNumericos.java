package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
	
		double a = 1; //impl�cita
		System.out.println(a);
		
		float b = (float)1.654545; //expl�cita (CAST)
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c; //expl�cita (CAST)
		System.out.println(d);	
		
		double e = 1;
		int f = (int)e;
		System.out.println(f);
	}
}
