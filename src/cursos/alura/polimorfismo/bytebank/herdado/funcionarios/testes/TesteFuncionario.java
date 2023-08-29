package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.testes;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.autenticavel.*;
import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.*;


public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("12312312312");
		nico.setSalario(2600.0);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
