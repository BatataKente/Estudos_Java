package exercices.java_SE_8_programmer_I._10;

import java.util.Scanner;

public class LidandoComExceções10_3 {
    public static void main(String[] args) {
    	_2();
    	System.out.println();
    	_3();
    }
//    a) Não compila. (alternativa certa)
//    b) Compila e, ao rodar, imprime “abc”.
//    c) Compila e, ao rodar, imprime “bc”.
//    d) Compila e, ao rodar, imprime “a”.
//    e) Compila e, ao rodar, imprime “b”.
	private static void _1() {
//		String name;
//		try {
//			name.toLowerCase();
//			System.out.print("a");
//		} catch(NullPointerException exception) {
//			System.out.print("b");
//		}
//		System.out.print("c");
	}
//  a) Não compila. 
//  b) Compila e, ao rodar, imprime “abc”.
//  c) Compila e, ao rodar, imprime “bc”. (alternativa certa)
//  d) Compila e, ao rodar, imprime “a”.
//  e) Compila e, ao rodar, imprime “b”.
	private static void _2() {
		String name = null;
		try {
//			name.toLowerCase();
			System.out.print("a");
		} catch(NullPointerException exception) {
			System.out.print("b");
		}
		System.out.print("c");
	}
//	a) Não compila.
//	b) Compila e, ao rodar, imprime “abcd”.
//	c) Compila e, ao rodar, imprime “bcd”. (alternativa certa)
//	d) Compila e, ao rodar, imprime “ac”.
//	e) Compila e, ao rodar, imprime “bc”.
//	f) Compila e, ao rodar, imprime “ad”.
//	g) Compila e, ao rodar, imprime “bd”.
	private static void _3() {
		String name = null;
		try {
			name.toLowerCase();
			System.out.print("a");
		 } catch(NullPointerException exception) {
			System.out.print("b");
		 } finally {
			System.out.print("c");
		 }
		 System.out.print("d");
	}
}
