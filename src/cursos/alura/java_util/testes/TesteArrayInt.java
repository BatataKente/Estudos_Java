package cursos.alura.java_util.testes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TesteArrayInt {
//	Array []
	public static void main(String[] args) {
//		int[] idades = new int[] {29, 39, 19, 69, 59};
		int[] idades = new int[5];
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 19;
//		idades[3] = 69;
//		idades[4] = 59;
		for (int i = 0; i < idades.length; i++) {
			idades[i] = (10*i) + 19;
		}
//		System.out.print(Arrays.toString(idades) + ", size: ");
//		System.out.println(idades.length);
		System.out.print("[");
		for (int i = 0; i < idades.length; i++) {
			if(i == idades.length - 1) {
				System.out.print(idades[i]); break;
			}
			System.out.print(idades[i] + ", ");
		}
		System.out.println("], size: " + idades.length);
	}
}
