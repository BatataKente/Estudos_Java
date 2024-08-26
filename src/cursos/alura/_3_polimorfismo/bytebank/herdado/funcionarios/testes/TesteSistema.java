package cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.testes;

import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.SistemaInterno;
import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.autenticavel.Cliente;
import cursos.alura._3_polimorfismo.bytebank.herdado.funcionarios.funcionario.*;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador administrador = new Administrador();
		administrador.setSenha(3333);
		
		Cliente cliente = new Cliente();
		administrador.setSenha(4444);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(administrador);
		sistemaInterno.autentica(cliente);
	}
}
