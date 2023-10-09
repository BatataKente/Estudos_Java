package cursos.alura._4_excecoes.pilha.testes;

import cursos.alura._4_excecoes.pilha.models.MinhaException;

public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
	        metodo1();
	    } catch(ArithmeticException exception) {
	    	exception.printStackTrace();
	    } catch(NullPointerException exception) {
	    	exception.printStackTrace();
	    } catch(MinhaException exception) {
	    	exception.printStackTrace();
	    }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//        try {
            metodo2();
//        } catch(ArithmeticException exception) {
//        	exception.printStackTrace();
//        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() { 
        System.out.println("Ini do metodo2");
//        metodo2();
        System.out.println("Fim do metodo2");
    }
}
