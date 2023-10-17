package cursos.alura._1_0_oo.banco.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import cursos.alura._1_0_oo.banco.models.documento.Documento;

public class Pagamentos implements Iterable<Pagamento> {

	private double valorPago;
	private final Collection<Pagamento> value = new HashSet<Pagamento>();

	public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : value) {
			if (pagamento.getData().before(data)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : value) {
			if (pagamento.getValor() > valorMinimo) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public ArrayList<Pagamento> pagamentosDo(Documento documentoPagador) {
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
		for (Pagamento pagamento : value) {
			if (pagamento.getDocumentoPagador().equals(documentoPagador)) {
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}

	public double getValorPago() {
		return this.valorPago;
	}

	public void registrar(Pagamento pagamento) {
		pagar(pagamento.getValor());
		value.add(pagamento);
	}

	private void pagar(final double valor) {
		if (valor < 0) throw new IllegalArgumentException("Valor inválido para pagamento.");
		double valorAPagar = valor;
		if (valorAPagar > 100) valorAPagar -= 8;
		valorPago += valorAPagar;
	}

	public boolean add(Pagamento pagamento) {
		pagar(pagamento.getValor());
		return value.add(pagamento);
	}
	
	public boolean addAll(Collection<? extends Pagamento> collection) {
		return value.addAll(collection);
	}

	public Iterator<Pagamento> iterator() {
		return value.iterator();
	}
}
