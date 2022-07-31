package classe;

public class ProdutoCarrinho {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4000.00);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 10.00;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double totalCarrinho = precoFinal1 + precoFinal2;
		
		System.out.printf("Total carrinho = R$%.2f.", totalCarrinho);
		
	}
}
