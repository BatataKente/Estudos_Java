package apresentacao._7_class_cast_exception;

import apresentacao._7_class_cast_exception.roberto.Jose;
import apresentacao._7_class_cast_exception.roberto.JoseJr;
import apresentacao._7_class_cast_exception.roberto.Roberto;
import exercices.java_SE_8_programmer_I._10.LidandoComExceções10_1;

public class ClassCastExceptionTest {
	public static void main(String[] args) {
//		ClassCastException: este erro é decorrente da tentativa de utilizar um objeto 
//		inferindo seu tipo de modo incorreto, cast seria uma forma de acessar o objeto 
//		que herda de uma determinada classe, como ele está em conformidade com a classe 
//		anterior(ex: Objeto) ele também pode ser tratado como tal.
		
//		ClassCastException classCastException = new ClassCastException();
		
		Roberto jose = new Jose();
		Roberto zezinho = new JoseJr();
//		clubeDeXadrez(jose);
		clubeDeXadrez(zezinho);
	}
	public static void clubeDeXadrez(Roberto roberto) {
		Jose jose = (Jose) roberto;
		System.out.print(roberto);
		System.out.println(" E eu sei jogar xadrez.");
		jose.jogarXadrez();
	}
}
