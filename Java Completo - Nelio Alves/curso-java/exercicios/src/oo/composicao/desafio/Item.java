package oo.composicao.desafio;

public class Item {
	
	//Referencia produto
	final Produto produto;
	final int quantidade;
	
	//Parametro
	Item (Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
