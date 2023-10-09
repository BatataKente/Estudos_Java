package br.com.caelum.livraria.dominio;

import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Autor;
import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Cliente;
import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Telefone;

public class ObjetosParaTestes {
	
	public static final Telefone UM_TELEFONE = new Telefone("11", "55555555");

	public static final String ddd = "11";
	public static final String telefone = "555555555";
	
	public static final String CEP = "03297060";
	public static final String ID_CLIENTE = "idCliente";
	public static final Cliente UM_CLIENTE = new Cliente("idCliente", ddd, telefone, CEP);
	public static final Cliente OUTRO_CLIENTE = new Cliente("outroIdCliente", ddd, telefone, CEP);
	public static final Autor umAutor = new Autor("Rodrigo vieira");
}
