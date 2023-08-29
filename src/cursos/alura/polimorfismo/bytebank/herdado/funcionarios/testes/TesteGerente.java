package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.testes;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel.Autenticavel;
import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.Gerente;


public class TesteGerente {
	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Josicleison");
		gerente.setCpf("99999999999");
		gerente.setSalario(5000);
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(2222);
		final boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
	}
}
