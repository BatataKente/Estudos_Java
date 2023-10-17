package cursos.alura._4_excecoes.pilha.testes;

import cursos.alura._4_excecoes.pilha.models.Conta;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
	        metodo1();
	    } catch(ArithmeticException exception) {
	    	exception.printStackTrace();
	    } catch(NullPointerException exception) {
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
//        boolean tentar = true;
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            if(tentar) {
//                try {
//                    int a = 1 / 0;
//                } catch(ArithmeticException exception) {
//                	exception.printStackTrace();
//                	tentar = false;
//                }
//            }
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
