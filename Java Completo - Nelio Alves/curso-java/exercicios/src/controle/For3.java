package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i<10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("\n[%d %d]", i, j);
			}
		}
		
		System.out.println("Saiu do for...");
		//System.out.println(i); //Gera conflito pois está restrito ao laço, porem pode usar 2 iguais, uma dentro e outra fora do laço 
	}
}
