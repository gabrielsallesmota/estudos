package classe;

public class valorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!!!"));
		
		//String s2;
		//System.out.println(s2.concat("????")); //Dar� erro pois a variavel nao inicializa
	
		//String s2 = null;
		//System.out.println(s2.concat("????")); //N�o se pode acessar atributo e nem m�todo de um valor null
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("?????"));
		}
	}
}
