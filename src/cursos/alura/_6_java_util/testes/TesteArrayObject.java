package cursos.alura._6_java_util.testes;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.*;

public class TesteArrayObject {
	public static void main(String[] args) {
		Conta[] contas = new Conta[5];
//		System.out.println(Arrays.toString(contas));
		
		ContaCorrente contaCorrente_1 = new ContaCorrente(22, 11);
		contas[0] = contaCorrente_1;
		
		ContaCorrente contaCorrente_2 = new ContaCorrente(22, 22);
		contas[1] = contaCorrente_2;
		
		ContaPoupanca contaCorrente_3 = new ContaPoupanca(44, 55);
		contas[2] = contaCorrente_3;
		
//		System.out.println(Arrays.toString(contas));
//		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());
		System.out.println(contas[2].getNumero());
		
//		Conta contaCorrente = contas[1];
		ContaCorrente contaCorrente = (ContaCorrente) contas[1];
		
		System.out.println(contaCorrente.getNumero());
		System.out.println(contaCorrente_2.getNumero());
	}
}
