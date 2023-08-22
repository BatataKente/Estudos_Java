package curso.Heranca.Teste;

import curso.Heranca.Desafio.Civic;
import curso.Heranca.Desafio.Ferrari;

public class Pista {
	public static void main(String[] args) {
		var civic = new Civic();
		var ferrari = new Ferrari();
		civic.acelerar();
		civic.freiar();
		civic.freiar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(civic.status());
		System.out.println(ferrari.status());
		System.out.println(ferrari.nivelDoAr());
	}
}
