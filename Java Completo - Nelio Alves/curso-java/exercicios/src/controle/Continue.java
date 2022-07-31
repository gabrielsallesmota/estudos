package controle;

public class Continue {

	public static void main(String[] args) {
		
		//Pula os numeros impares
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//Pula o 5 e continua
		for (int i = 1; i <= 10; i++) {
			if (i == 5) continue;
			System.out.println(i);
		}
	}
}
