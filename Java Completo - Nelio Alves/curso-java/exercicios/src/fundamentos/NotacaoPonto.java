package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
	//	double a = 2.3;
		String s = "Bom dia X"; //String é sempre declarada com letra maiúscula 
		s = s.toUpperCase(); //faz com que torne tudo em letra maiuscula, porém nao altera o valor original
		System.out.println(s);
		
		s = s.replace("X", "Senhora"); //coloca-se "s = s." para que a variável assuma o novo comando
		System.out.println(s);
		
		s = s.concat("!!!"); //função para concatenar, igual é feito com +
		System.out.println(s);
		
		String x = "Gabriel".toUpperCase();
		System.out.println(x);
		
		String y = "Bom Dia X".replace("X", "Gabriel").toUpperCase();
		System.out.println(y);
	}
}
