package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		/* 
		 	Tipos Primitivos - 8 tipos
		 	
		 	6 tipos numéricos 
		 		4 inteiros (byte(1), short(2), int(4) e long(8));  Byte armazena intervalo de -128 até +127
		 		2 flutuantes (float(4), double(8));
		 	
		 	2 tipos primitivos
		 		Char (entre aspas simples representam um char);
		 		Boolean (verdadeiro ou falso);
		 */
		
		//Informações do Funcionário
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 400;
		int id = 7850;
		long pontosAcumulados = 1_458_874_111; //pode-se utilizar underline para divisão do algoritmo
		
		//Tipos numéricos reais
		float salario = 11_445.44f; //tem que usar pois está usando um tipo double, entao precisa mostrar
		double vendasAcumuladas = 2_554_485_874.82;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = '1'; //ativo //tipo caracter só aceita uma letra
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
