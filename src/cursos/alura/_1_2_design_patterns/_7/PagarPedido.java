package cursos.alura._1_2_design_patterns._7;

public class PagarPedido implements Work {

	private final Pedido pedido;

	public PagarPedido(final Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public void execute() {
		System.out.println("pagando pedido do " + pedido.getCliente());
		pedido.finalizar();
	}
}
