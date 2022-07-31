package oo.composicao.desafio;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1.70, 5);
		compra1.adicionarItem("Copo", 0.80, 12);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Lapis", 1.13, 2);
		compra2.adicionarItem("Chinelo", 17.99, 1);
		
		//Segundo forma utiliza um método que adiciona compras.
		Cliente cliente = new Cliente("Maria Joana Silva");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
}
