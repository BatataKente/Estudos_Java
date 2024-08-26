package curso.Controle.Lacos;

import java.util.Scanner;

public class SwitchNoBreak {
	public static void main(String[] args) {
		precoce(3);
	}
	static void catasKarate() {
		var faixa = "marrom";
		switch (faixa.toLowerCase()) {
			case "preta": 
				System.out.print("Sabe Bassai-Dai\n");
			case "marrom": 
				System.out.print("Sabe Tekki Shodan\n");
			case "roxa": 
				System.out.print("Sabe Heian Godan\n");
			case "verde": 
				System.out.print("Sabe Heian Yodan\n");
			case "laranja": 
				System.out.print("Sabe Heian Sandan\n");
			case "vermelha": 
				System.out.print("Sabe Heian Nidan\n");
			case "amarela": 
				System.out.print("Sabe Heian Shodan\n"); break;
			default: System.out.println("Não sei nada");
		}
		System.out.print("Fim!!");
	}
	static void catasKarate(Scanner input) {
		switch (input.next().toLowerCase()) {
			case "preta": 
				System.out.print("Sabe Bassai-Dai\n");
			case "marrom": 
				System.out.print("Sabe Tekki Shodan\n");
			case "roxa": 
				System.out.print("Sabe Heian Godan\n");
			case "verde": 
				System.out.print("Sabe Heian Yodan\n");
			case "laranja": 
				System.out.print("Sabe Heian Sandan\n");
			case "vermelha": 
				System.out.print("Sabe Heian Nidan\n");
			case "amarela": 
				System.out.print("Sabe Heian Shodan\n"); break;
			case "branca": 
				System.out.print("Ainda não sabe nenhum cata\n"); break;
			default: System.out.print("Essa faixa não existe\n"); break;
		}
	}
	static void catasKarate(String faixa) {
		switch (faixa.toLowerCase()) {
			case "preta": 
				System.out.print("Sabe Bassai-Dai\n");
			case "marrom": 
				System.out.print("Sabe Tekki Shodan\n");
			case "roxa": 
				System.out.print("Sabe Heian Godan\n");
			case "verde": 
				System.out.print("Sabe Heian Yodan\n");
			case "laranja": 
				System.out.print("Sabe Heian Sandan\n");
			case "vermelha": 
				System.out.print("Sabe Heian Nidan\n");
			case "amarela": 
				System.out.print("Sabe Heian Shodan\n"); break;
			case "branca": 
				System.out.print("Ainda não sabe nenhum cata\n"); break;
			default: System.out.print("Essa faixa não existe\n"); break;
		}
	}
	static void precoce(int idade) {
		switch (idade) {
			case 3:
				System.out.println("Sabe programar");
			case 2:
				System.out.println("Sabe falar");
			case 1: 
				System.out.println("Sabe andar");
			case 0: 
				System.out.println("Sabe respirar");
		}
	}
}
