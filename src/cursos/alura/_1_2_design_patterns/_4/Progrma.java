package cursos.alura._1_2_design_patterns._4;

import java.util.Calendar;

public class Progrma {
	public static void main(String[] args) {
		
		Historico historico = new Historico();
		Contrato contrato = new Contrato(Calendar.getInstance(), "Josicleison", TipoDeContrato.NOVO);
		historico.add(contrato.saveState());
		
		
		System.out.println(contrato.getTipo());
		contrato.next();
		historico.add(contrato.saveState());
		System.out.println(contrato.getTipo());
		contrato.next();
		historico.add(contrato.saveState());
		System.out.println(contrato.getTipo());
		
		State estadoAnterior = historico.get(2);
		System.out.println(estadoAnterior.getState().getTipo());
	}
}
