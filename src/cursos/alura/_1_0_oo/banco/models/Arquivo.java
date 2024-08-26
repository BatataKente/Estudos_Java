package cursos.alura._1_0_oo.banco.models;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class Arquivo implements ArmazenadorDeDividas {

	@Override
	public void salvar(Divida divida) {
	}

	@Override
	public Divida carregar(Documento documento) {
		return null;
	}
}
