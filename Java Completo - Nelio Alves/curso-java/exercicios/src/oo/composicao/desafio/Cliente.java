package oo.composicao.desafio;

//Chamada para nao ser importado automaticamente
import java.util.List;
import java.util.ArrayList;

public class Cliente {
	
	//Cliente tem muitas compras. Mas a compra tem apenas um cliente.
	
	final String nome;
	
	//Construtor de cliente 
	Cliente (String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	//Array para compras
	final List<Compra> compras = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		//segundo "compra" é o nome da variável
		for (Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
