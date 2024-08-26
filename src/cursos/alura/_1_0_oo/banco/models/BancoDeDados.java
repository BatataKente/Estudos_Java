package cursos.alura._1_0_oo.banco.models;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class BancoDeDados implements ArmazenadorDeDividas {
	private Map<Documento, Divida> dividasNoBanco = new HashMap<Documento, Divida>();

	public BancoDeDados(final String endereco, final String usuario, final String senha) {
		System.out.println("Conectado!");
	}

	public void salvar(Divida divida) {
		dividasNoBanco.put(divida.getDocumentoCredor(), divida);
	}

	public Divida carregar(Documento documentoCredor) {
		return dividasNoBanco.get(documentoCredor);
	}

	public void connect(Consumer<BancoDeDados> bancoDeDados) {
		bancoDeDados.accept(this);
		desconectar();
	}

	public void desconectar() {
		System.out.println("Desconectado!");
	}
}
