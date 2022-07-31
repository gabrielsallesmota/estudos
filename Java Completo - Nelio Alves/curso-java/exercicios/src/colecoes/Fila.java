package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
		
		fila.add("Ana"); //Adicionar a fila, se tem tamanho pr� definido da erro
		fila.offer("Bia"); //Adicionar a fila, por�m se tem tamanho pr� definido ele retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //peek para mostrar o primeiro da fila, se repetir ele mostra o mesmo, por�m se a fila est� vazia da null
		System.out.println(fila.element()); //element mostra tamb�m, mas se est� vazia a fila ele retorna um erro
		
		//fila.size()
		//fila.clear()
		//fila.isEmpty()
		//fila.contains(...)
		
		System.out.println(fila.remove()); //lan�a uma exce��o
		System.out.println(fila.poll()); //retorna false
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		
	}
}
