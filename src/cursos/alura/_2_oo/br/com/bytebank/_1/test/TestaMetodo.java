package cursos.alura._2_oo.br.com.bytebank._1.test;

import cursos.alura._2_oo.br.com.bytebank._1.model.Cliente;
import cursos.alura._2_oo.br.com.bytebank._1.model.Conta;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoJosicleison = new Conta();
		contaDoJosicleison.depositar(100);
		contaDoJosicleison.depositar(50);
		System.out.println(contaDoJosicleison.getSaldo());
		final boolean conseguiuSacar = contaDoJosicleison.sacar(20);
		System.out.println(contaDoJosicleison.getSaldo());
		System.out.println(
				conseguiuSacar? "Conseguiu sacar" : "Não conseguiu sacar"
		);
		Conta contaDaMarcidineia = new Conta();
		contaDaMarcidineia.depositar(1000);
		if(contaDaMarcidineia.transferir(300, contaDoJosicleison)) {
			System.out.println("Transferencia feita com sucesso.");
			System.err.println(contaDaMarcidineia.getSaldo());
			System.err.println(contaDoJosicleison.getSaldo());
		}
		Cliente josicleison = new Cliente();
		josicleison.nome = "Josicleison Elves";
		contaDoJosicleison.titular = josicleison;
		System.err.println(contaDoJosicleison.titular);
	}
}
