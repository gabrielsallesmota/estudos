package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		HashSet<Object> conjunto = new HashSet<>();
		
		conjunto.add(1.2); //double ele converte em classe Double, pois ele só aceita primitivo
		conjunto.add(true); //boolean para Boolen
		conjunto.add("Teste");
		conjunto.add(1); //int para Integer
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é " + conjunto.size()); //mesmo valor por ele nao aceita repetição
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("Tamanho é " + conjunto.size()); //foi removido o "Teste" e 'x'
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
	}
}	
