package cursos.alura.oo.br.com.bytebank._1.test;

import cursos.alura.oo.br.com.bytebank._1.model.Cliente;
import cursos.alura.oo.br.com.bytebank._1.model.Conta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente josicleison = new Cliente();
		josicleison.nome = "Josicleison Elves";
		josicleison.cpf = "000.000.000-00";
		josicleison.profissao = "Cientista da NASA";
		Conta contaDoJosicleison = new Conta();
		contaDoJosicleison.depositar(100);
		contaDoJosicleison.titular = josicleison;
		System.out.println(contaDoJosicleison.titular.nome);
	}
}
