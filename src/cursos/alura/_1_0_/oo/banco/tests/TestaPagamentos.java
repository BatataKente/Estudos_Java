package cursos.alura._1_0_.oo.banco.tests;

import java.util.Arrays;

import cursos.alura._1_0_.oo.banco.models.Pagamento;
import cursos.alura._1_0_.oo.banco.models.Pagamentos;

public class TestaPagamentos {
	
	public static void main(String[] args) {
		
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento(null, 25);
		Pagamento pagamento2 = new Pagamento(null, 105);
		
//		pagamentos.add(pagamento1);
//		pagamentos.add(pagamento2);
		
		pagamentos.registrar(pagamento1);
		pagamentos.registrar(pagamento2);
		
//		pagamentos.addAll(Arrays.asList(new Pagamento[] {pagamento1, pagamento2}));
		
		System.out.print(String.format("Valor total pago: R$ %.2f.\n", pagamentos.getValorPago()));
	}
}
