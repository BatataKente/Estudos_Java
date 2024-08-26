package cursos.alura._2_oo.br.com.bytebank._1.model;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.depositar(200);
		primeiraConta.depositar(100);
		
		Conta segundaConta = new Conta();
		segundaConta.depositar(50);
		segundaConta.agencia = 146;
		
		System.out.println("Primeira conta tem: " + primeiraConta.getSaldo());
		System.out.println("Segunda conta tem: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titular);
		
		//08_Referências vs Objetos **aula atual
		
		if(primeiraConta != segundaConta) System.out.print("nao ");
		System.out.println("sao a mesma conta.");
	}
}
