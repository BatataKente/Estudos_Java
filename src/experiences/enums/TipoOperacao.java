package experiences.enums;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Map;

public enum TipoOperacao {
	APLICACAO {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto) throws NumberFormatException
				 {
			return this;
		}
	},
	RESGATE_TOTAL {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto)
				throws NumberFormatException{
			return this;
		}
	},
	RESGATE_PARCIAL {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto)
				throws NumberFormatException{
			return this;
		}
	},
	RESGATE {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto)
				throws NumberFormatException{
			return this;
		}
	},
	CANCELAMENTO_APLICACAO_DO_DIA {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto)
				throws NumberFormatException{
			return this;
		}
	},
	CANCELAMENTO_RESGATE_DO_DIA {
		@Override
		public TipoOperacao efetivar(int payload, String codigoProduto)
				throws NumberFormatException{
			return this;
		}
	};
	
	public static TipoOperacao fromValue(String value) {
		return new HashMap<String, TipoOperacao>() {{
			put("Aplicacao", APLICACAO);
			put("Resgate Total", RESGATE_TOTAL);
			put("Resgate Parcial", RESGATE_PARCIAL);
			put("Resgate", RESGATE);
			put("Cancelamento Aplicação do Dia", CANCELAMENTO_APLICACAO_DO_DIA);
			put("Cancelamento Resgate do Dia", CANCELAMENTO_RESGATE_DO_DIA);
		}}.get(value);
	}

	protected Map<String, String> loginState;		
	private String saldoAplicacao;
	private String saldoResgate;
	
	public TipoOperacao setLoginState(Map<String, String> loginState) {
		this.loginState = loginState;
		return this;
	}
	
	public void setSaldoAplicacao(String saldoAplicacao) {
		this.saldoAplicacao = saldoAplicacao;
	}
	
	public void setSaldoResgate(String saldoResgate) {
		this.saldoResgate = saldoResgate;
	}
	
	public String getSaldoAplicacao() {
		return saldoAplicacao;
	}
	
	public String getSaldoResgate() {
		return saldoResgate;
	}
	
	public abstract TipoOperacao efetivar(int payload, String codigoProduto)
			throws NumberFormatException;
}