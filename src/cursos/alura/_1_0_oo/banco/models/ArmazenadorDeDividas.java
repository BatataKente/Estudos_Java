package cursos.alura._1_0_oo.banco.models;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public interface ArmazenadorDeDividas {
	void salvar(Divida divida);
	Divida carregar(Documento documento);
}
