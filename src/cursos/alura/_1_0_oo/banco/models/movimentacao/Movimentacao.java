package cursos.alura._1_0_oo.banco.models.movimentacao;

import java.util.Calendar;

import cursos.alura._2_oo.br.com.bytebank._1.model.Conta;

public class Movimentacao {
    private double valor;
    private Conta conta;
    private Calendar data;

    public double getEncargos() {
      return valor * 0.01;
    }
    
    public Conta getConta() {
		return conta;
	}
    
    public Calendar getData() {
		return data;
	}
    
    public double getValor() {
		return valor;
	}
    
    public void setValor(double valor) {
		this.valor = valor;
	}
    
    public void setConta(Conta conta) {
		this.conta = conta;
	}
    
    public void setData(Calendar data) {
		this.data = data;
	}
}
