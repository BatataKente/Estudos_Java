package cursos.alura._1_0_.oo.banco.models;

import java.util.HashMap;

public class BalancoEmpresa {
	
	private HashMap<CNPJ, Divida> dividas = new HashMap<CNPJ, Divida>();
	
	public void registraDivida(
			final CNPJ credor,
			final double valor
	) {
		Divida divida = new Divida(credor, valor);
		dividas.put(credor, divida);
	}
	
	public void pagarDivida(
			final PessoaJuridica pagador, 
			final CNPJ cnpjDoCredor, 
			final double valor
	) {
		Divida divida = dividas.get(cnpjDoCredor);
		if(divida == null) return;
		divida.registrar(new Pagamento(pagador, valor));
	}
	
	public void pagarDivida(
			final CNPJ cnpjDoCredor, 
			final Pagamento pagamento
	) {
		Divida divida = dividas.get(cnpjDoCredor);
		if(divida == null) return;
		divida.registrar(pagamento);
	}
}
