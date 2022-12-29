package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Josicleison");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Marcidinelson");
		fila.add("Rafaela");
//		fila.clear();
		fila.offer("Guilermino");
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila);
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.print(fila);
	}
}
