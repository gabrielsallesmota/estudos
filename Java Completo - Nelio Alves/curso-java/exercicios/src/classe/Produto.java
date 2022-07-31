package classe;

public class Produto {
		
		String nome;
		double preco;
		static double desconto = 0.25;
		
		Produto(String nomeInicial, double precoInicial){
			nome = nomeInicial;
			preco = precoInicial;
		}
		
		Produto (){
			
		}

		double precoComDesconto (){
			return (preco * (1 - desconto));
	}
}

/*
 * DESAFIO
 * 
 * Loja, politica que todos os produtos com 25% de desconto. Se for Natal, todos com 30%. 
 * Ao inves de um desconto pra cada, o desconto vai ser uma variável de classe;
 */ 
