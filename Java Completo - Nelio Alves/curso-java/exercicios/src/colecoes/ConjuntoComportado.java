package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main (String [] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); com set e hashset ele nao deixa na ordem
		SortedSet<String> listaAprovados = new TreeSet<>(); //com sortedset e treeset ele ordena
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
		}
	}

}
