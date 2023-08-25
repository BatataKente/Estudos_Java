package cursos.alura.oo.bytebank._1;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente josicleison = new Cliente();
		josicleison.nome = "Josicleison Elves";
		josicleison.cpf = "000.000.000-00";
		josicleison.profissao = "Cientista da NASA";
		Conta contaDoJosicleison = new Conta();
		contaDoJosicleison.depositar(100);
		contaDoJosicleison.titular = josicleison;
		System.out.println(contaDoJosicleison.titular.nome);
	}
}
