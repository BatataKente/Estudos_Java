package experiences.api_request_manager.spring_boot;

import java.util.Date;

import com.google.gson.Gson;

@SuppressWarnings("unused")
public class Cliente {

	private Long id;
	private Boolean isExcluir;
	private Boolean isAlterar;
	private String servico;
	private String saldo;
	private String produto;
	private Integer agencia;
	private String tipoManutencao;
	private Integer banco;
	private Integer conta;
	private Integer digito;
	private String nome;
	private String tipoConta;
	private String nomePeriodicidade;
	private String nomeMidia;
	private String tipoLayout;
	private String cpfCnpj;
	private String firma;
	private String numeroContrato;
	private String situacaoContrato;
	private String modalidadeProduto;
	private String escolaridade;
	private String instituicao;
	private Boolean isEspecifica;
	private String situacao;
	private Boolean exibeColunaAgencia;
	private Date dataInicio;
	private Date dataFim;
	private Integer numeroAgencia;
	
	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
