package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
		
		fila.add("Ana"); //Adicionar a fila, se tem tamanho pré definido da erro
		fila.offer("Bia"); //Adicionar a fila, porém se tem tamanho pré definido ele retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //peek para mostrar o primeiro da fila, se repetir ele mostra o mesmo, porém se a fila está vazia da null
		System.out.println(fila.element()); //element mostra também, mas se está vazia a fila ele retorna um erro
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains(...)
		
		System.out.println(fila.remove()); //lança uma exceção
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
	}
}
