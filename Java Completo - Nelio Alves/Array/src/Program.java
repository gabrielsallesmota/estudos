import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //para na posição 2 adicionar o 'Marcos'
		
		System.out.println(list.size());
		
		list.remove("Anna");
		
		System.out.println(list.size());
		
		for (String x : list) { //para cada String x pertencente a lista 'list'
			System.out.println(x);
		}
	}

}
 
/*
 * Para remover elemento por predicado:
 * 		list.removeIf(x -> x.charAt(0) == 'M'); //x tal que chartAt 0 é igual a M
 * 
 * Para ficar na lista apenas os nomes começados com 'A'
 * 		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
 * 
 * Para mostrar a posição de alguém:
 * 		System.out.println("Index of Bob: " + list.indexOf("Bob")); //quando não encontra elemento ele retorna -1
 * 			Resultado: Index of Bob: 1 
 * 
 * Para mostrar o primeiro o elemento que comece com a letra 'A'
 * 		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
 */
