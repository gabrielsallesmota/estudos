package com.projeto.conta;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		 conta.depositar(100); 
		 conta.sacar(50);
		 
		 conta.minhaPropriedadeProtegida = "Gabriel";
		
		 System.out.println (conta.minhaPropriedadeProtegida);

	}

}
