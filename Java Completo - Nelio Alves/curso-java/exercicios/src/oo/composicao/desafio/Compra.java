package oo.composicao.desafio;

import java.util.List;
import java.util.ArrayList;

public class Compra {
	
	//Rela��o com Item
	final List <Item> itens = new ArrayList<>();
	
	//Metodo para adicionar um item
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto (nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	//Metodo para retornar valor total
	double obterValorTotal() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
