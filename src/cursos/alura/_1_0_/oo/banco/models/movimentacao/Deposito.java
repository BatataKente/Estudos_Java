package cursos.alura._1_0_.oo.banco.models.movimentacao;

public class Deposito {
	
	private String numeroEnvelope;
	private Movimentacao movimentacao = new Movimentacao();
	
	public Movimentacao getMovimentacao() {
		return movimentacao;
	}
	
	public double getEncargos() {
		throw new RuntimeException("Depositos não sofrem encargos");
	}
	
	public String getNumeroEnvelope() {
		return numeroEnvelope;
	}
	
	public void setNumeroEnvelope(String numeroEnvelope) {
		this.numeroEnvelope = numeroEnvelope;
	}
}
