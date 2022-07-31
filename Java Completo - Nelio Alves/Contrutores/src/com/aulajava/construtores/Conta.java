package com.aulajava.construtores;

public class Conta {
	
	private int numeroConta;
	private double saldo;
	
	//supondo que eu preciso usar a conta, e o numeroConta gerencie a conta real, eu crio Construtores.
	//Construtor deixa o objeto pronto para ser utilizado.
	
	public Conta(int nConta) {
		//Corpo (Diz o que construtor faz)
		//Inicializar a conta
		
		this.numeroConta = nConta;
	}
	
	public void imprime () {
		
		System.out.println(this.numeroConta);
	}
	
	
}
