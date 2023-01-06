package Heranca.Desafio;

public class Pista {
	public static void main(String[] args) {
		var civic = new Civic();
		var ferrari = new Ferrari();
		civic.acelerar();
		civic.freiar();
		civic.freiar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(civic.status());
		System.out.println(ferrari.status());
	}
}
