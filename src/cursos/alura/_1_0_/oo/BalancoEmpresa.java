package cursos.alura._1_0_.oo;

import java.util.HashMap;

public class BalancoEmpresa {
	
	private HashMap<PessoaJuridica, Divida> dividas = new HashMap<PessoaJuridica, Divida>();
	
	public void registraDivida(
			final PessoaJuridica credor,
			final double valor
	) {
		Divida divida = new Divida(credor, valor);
		dividas.put(credor, divida);
	}
	
	public void pagarDivida(
			final PessoaJuridica pagador, 
			final PessoaJuridica credor, 
			final double valor
	) {
		Divida divida = dividas.get(credor);
		if(divida == null) return;
		divida.registra(new Pagamento(pagador, valor));
	}
}
