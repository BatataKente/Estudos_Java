package br.com.caelum.livraria.dominio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.javamoney.moneta.Money;
import org.junit.Test;

import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.FormatadorUtils;
import cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio.Livraria;

public class FormatadorUtilsTest {
	
	@Test
	public void formatarUmValorMonetario() {
		Money dinheiro = Money.of(100, Livraria.reais);
		
		assertThat(FormatadorUtils.getValorFormatado(dinheiro), is(equalTo("R$ 100,00")));
	}
}
