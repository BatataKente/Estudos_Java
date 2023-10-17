package cursos.alura._1_2_design_patterns._7;

public class Programa {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Josicleison", 150);
		Pedido pedido2 = new Pedido("Josicleide", 250);
		
		Workflow filaDeTrabalho = new Workflow();
		
		filaDeTrabalho.add(new PagarPedido(pedido1));
		filaDeTrabalho.add(new PagarPedido(pedido2));
		filaDeTrabalho.add(new ConcluirPedido(pedido1));
		filaDeTrabalho.add(new ConcluirPedido(pedido2));
		
		filaDeTrabalho.process();
	}
}
