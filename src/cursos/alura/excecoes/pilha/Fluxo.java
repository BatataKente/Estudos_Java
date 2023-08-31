package cursos.alura.excecoes.pilha;

public class Fluxo {

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
        MinhaException exception = new MinhaException("Deu rui!");
        throw exception;
//        System.out.println("Fim do metodo2");
    }
}
