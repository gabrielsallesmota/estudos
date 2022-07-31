package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		/* 
		 	Tipos Primitivos - 8 tipos
		 	
		 	6 tipos num�ricos 
		 		4 inteiros (byte(1), short(2), int(4) e long(8));  Byte armazena intervalo de -128 at� +127
		 		2 flutuantes (float(4), double(8));
		 	
		 	2 tipos primitivos
		 		Char (entre aspas simples representam um char);
		 		Boolean (verdadeiro ou falso);
		 */
		
		//Informa��es do Funcion�rio
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 400;
		int id = 7850;
		long pontosAcumulados = 1_458_874_111; //pode-se utilizar underline para divis�o do algoritmo
		
		//Tipos num�ricos reais
		float salario = 11_445.44f; //tem que usar pois est� usando um tipo double, entao precisa mostrar
		double vendasAcumuladas = 2_554_485_874.82;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = '1'; //ativo //tipo caracter s� aceita uma letra
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
