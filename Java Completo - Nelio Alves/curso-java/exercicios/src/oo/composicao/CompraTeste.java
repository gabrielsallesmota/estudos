package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra ();
		compra1.cliente = "Jonas José";
		compra1.itens.add(new Item("Caneta", 20, 7.45));
		compra1.itens.add(new Item("Borracha", 12, 3.89));
		compra1.itens.add(new Item("Lápis", 2,1.20));
		
		System.out.println(compra1.itens.size()); //quantidade de itens
		System.out.println(compra1.obterValorTotal()); //valor total do pedido

	}
}
