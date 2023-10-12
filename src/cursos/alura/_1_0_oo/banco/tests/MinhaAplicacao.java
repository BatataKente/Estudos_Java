package cursos.alura._1_0_oo.banco.tests;

import cursos.alura._1_0_oo.banco.models.BalancoEmpresa;
import cursos.alura._1_0_oo.banco.models.BancoDeDados;
import cursos.alura._1_0_oo.banco.models.Divida;
import cursos.alura._1_0_oo.banco.models.Pagamento;
import cursos.alura._1_0_oo.banco.models.documento.CNPJ;

public class MinhaAplicacao {
	public static void main(String[] args) {
		new BancoDeDados("localhost", "cara", "123").connect(
				bancoDeDados -> {
					BalancoEmpresa balanco = new BalancoEmpresa(bancoDeDados);
					registraDividas(balanco);
					realizaPagamentos(balanco);
				}
		);
		
//		BancoDeDados bancoDeDados = new BancoDeDados("localhost", "cara", "123");
//		BalancoEmpresa balanco = new BalancoEmpresa(bancoDeDados);
//		registraDividas(balanco);
//		realizaPagamentos(balanco);
//		bancoDeDados.desconectar();
		
//		ArmazenadorDeDividas bancoDeDados = new Arquivo();
//		BalancoEmpresa balanco = new BalancoEmpresa(bancoDeDados);
//		registraDividas(balanco);
//		realizaPagamentos(balanco);
	}

	private static void registraDividas(BalancoEmpresa balanco) {
		Divida d1 = new Divida();
		Divida d2 = new Divida();
		balanco.registrarDivida(d1);
		balanco.registrarDivida(d2);
	}

	private static void realizaPagamentos(BalancoEmpresa balanco) {
		Pagamento p1 = new Pagamento();
		Pagamento p2 = new Pagamento();
		CNPJ credor = new CNPJ("00.000.000/0001-01");
		balanco.pagarDivida(credor, p1);
		balanco.pagarDivida(credor, p2);
	}
}
