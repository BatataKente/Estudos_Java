package cursos.alura._1_2_design_patterns._8;

import cursos.alura._1_1_SOLID.acoplamento._1.Fatura;
import experiences.api_request_manager.spring_boot.Cliente;

public class EmpresaFacade {

	protected EmpresaFacade() {}
	
    public Cliente buscarCliente(String cpf) {
        return new ClienteDao().buscaPorCpf(cpf);
    }
    
    public Fatura criarFatura(Cliente cliente, double valor) {
        Fatura fatura = new Fatura(cliente, valor);
        return fatura;
    }

    public Cobranca gerarCobranca(Fatura fatura) {
        Cobranca cobranca = new Cobranca(Tipo.BOLETO, fatura);
        cobranca.emite();

        return cobranca;
    }

    public ContatoCliente fazerContato(Cliente cliente, Cobranca cobranca) {
        ContatoCliente contato = new ContatoCliente(cliente, cobranca);
        contato.dispara();

        return contato;
    }
}