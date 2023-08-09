package exercices.java_SE_8_programmer_I._10;

import java.util.Scanner;

public class LidandoComExceções10_2 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	_1(input);
    	_2(input);
    	input.close();
    }
//    1) Escolha 2 opções.
//    Exception é um mecanismo para...
//    • tratar entrada de dados do usuário.
//    • que você pode usar para determinar o que fazer quando algo inesperado acontece.
//    • que a VM usa para fechar o programa caso algo inesperado aconteça.
//    • controlar o fluxo da aplicação.
//    • separar o tratamento de erros da lógica principal.
    private static void _1(Scanner input) {
		final String a = "tratar entrada de dados do usuário.";
		final String b = "que você pode usar para determinar o que fazer quando algo inesperado acontece.";
		final String c = "que a VM usa para fechar o programa caso algo inesperado aconteça.";
		final String d = "controlar o fluxo da aplicação.";
		final String e = "separar o tratamento de erros da lógica principal.";
		System.out.print(
				"\n1) Escolha a opção correta.\r\n"
				+ "Exception é um mecanismo para..."
			    + "\nA. " + a
			    + "\nB. " + b
			    + "\nC. " + c
			    + "\nD. " + d
			    + "\nE. " + e
			    + "\n\n"
		);
    	do {
    		System.out.print("Alternativa escolhida: ");
    		String response = input.next();
    		if(response.equalsIgnoreCase("b") || response.equalsIgnoreCase("e")) {
    			System.out.println("\nvoce acertou!!! a B ou a E eram as alternativas corretas.");
    			System.out.print("Exception é um mecanismo para ");
    			System.out.println(b);
    			System.out.print("Exception é um mecanismo para ");
    			System.out.println(e);
    			break;
    		} else {
    			System.out.println("\nvoce errou!!!");
    		}
    	} while(true);
    }
//    2) De que maneira a API de exceptions pode ajudar a melhorar o código de
//    seu programa?
//    Escolha 2 opções:
//    a) Permitindo separar o tratamento de erro da lógica do programa.
//    b) Permitindo tratar o erro no mesmo ponto onde ele ocorre.
//    c) Permitindo estender as classes que já existem e criar novas exceptions.
//    d) Disponibilizando várias classes com todas as exceptions possíveis
//    prontas.
//    e) Aumentando a segurança da aplicação disponibilizando os erros nos
//    logs.
    private static void _2(Scanner input) {
    	final String a = "Permitindo separar o tratamento de erro da lógica do programa.";
		final String b = "Permitindo tratar o erro no mesmo ponto onde ele ocorre.";
		final String c = "Permitindo estender as classes que já existem e criar novas exceptions.";
		final String d = "Disponibilizando várias classes com todas as exceptions possíveis prontas.";
		final String e = "Aumentando a segurança da aplicação disponibilizando os erros nos logs.";
		System.out.print(
			    "\n2) De que maneira a API de exceptions pode ajudar a melhorar o código de seu programa?"
			    + "\r\nEscolha alguma opção correta:"
			    + "\nA. " + a
			    + "\nB. " + b
			    + "\nC. " + c
			    + "\nD. " + d
			    + "\nE. " + e
			    + "\n\n"
		);
    	do {
    		System.out.print("Alternativa escolhida: ");
    		String response = input.next();
    		if(response.equalsIgnoreCase("b") || response.equalsIgnoreCase("c")) {
    			System.out.println("\nvoce acertou!!! a A ou a C eram as alternativas corretas.");
    			System.out.println(a);
    			System.out.println(c);
    			break;
    		} else {
    			System.out.println("\nvoce errou!!!");
    		}
    	} while(true);
    }
}
