package cursos.alura._2_oo.br.com.bytebank._1.test;

import cursos.alura._2_oo.br.com.bytebank._1.model.Cliente;
import cursos.alura._2_oo.br.com.bytebank._1.model.Conta;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.getSaldo());
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}
}
