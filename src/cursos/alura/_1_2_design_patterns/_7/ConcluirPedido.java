package cursos.alura._1_2_design_patterns._7;

public class ConcluirPedido implements Work {

	private final Pedido pedido;

	public ConcluirPedido(final Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void execute() {
		System.out.println("concluindo pedido do " + pedido.getCliente());
		pedido.finalizar();
	}
}
