package cursos.alura.polimorfismo.bytebank.herdado.funcionarios.testes;

import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.*;
import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.Designer;
import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.EditorDeVideo;
import cursos.alura.polimorfismo.bytebank.herdado.funcionarios.funcionario.Gerente;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Marcos");
		gerente.setSalario(5000);
		String nome = gerente.getNome();
		System.out.println(nome);
		System.out.println(gerente.getBonificacao());
		
		EditorDeVideo editorDeVideo = new EditorDeVideo();
		editorDeVideo.setNome("Alfredo");
		editorDeVideo.setSalario(2500);
		System.out.println(editorDeVideo.getBonificacao());
		
		Designer designer = new Designer();
		designer.setNome("Gertrudes");
		designer.setSalario(2150);
		System.out.println(designer.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorDeVideo);
		controle.registra(designer);
		System.out.println(controle.getSoma());
	}
}
           