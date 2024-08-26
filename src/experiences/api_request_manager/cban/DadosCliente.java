package experiences.api_request_manager.cban;

import java.util.Date;

import com.google.gson.Gson;

public class DadosCliente {
	
	private Long id;
	private Boolean isExcluir = false;
	private Boolean isAlterar = false;
	private String servico = null;
	private String saldo = null;
	private String produto = null;
	private Integer agencia = 0;
	private String tipoManutencao = null;
	private Integer banco = 0;
	private Integer conta = 0;
	private Integer digito = 0;
	private String nome = null;
	private String tipoConta = null;
	private String nomePeriodicidade = null;
	private String nomeMidia = null;
	private String tipoLayout = null;
	private String cpfCnpj = null;
	private String firma = null;
	private String numeroContrato = null;
	private String situacaoContrato = null;
	private String modalidadeProduto = null;
	private String escolaridade = "";
	private String instituicao = "";
	private Boolean isEspecifica = false;
	private String situacao = null;
	private Boolean exibeColunaAgencia = false;
	private Date dataInicio = null;
	private Date dataFim = null;
	private Integer numeroAgencia = 0;
	private Integer numeroAgencie = 0;
	
	public static DadosCliente instanciateByJson(final String json) {
		return new Gson().fromJson(json, DadosCliente.class);
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
