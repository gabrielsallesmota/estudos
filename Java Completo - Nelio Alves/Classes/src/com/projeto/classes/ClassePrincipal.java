package com.projeto.classes;

public class ClassePrincipal {
	
	public static void main(String [] args) {
		
		Casa minhaCasa = new Casa(); //dessa forma criamos uma variavel minhaCasa do tipo Casa. E o new casa instancia a classe, apontando um lugar na memoria onde est� o objeto casa em mem�ria.
		
		minhaCasa.cor = "Azul";
		
		System.out.println (minhaCasa.cor);
		
		minhaCasa.abrirGaragem();
	}

}
