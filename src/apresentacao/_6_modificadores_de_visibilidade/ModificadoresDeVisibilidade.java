package apresentacao._6_modificadores_de_visibilidade;

public class ModificadoresDeVisibilidade {
//	Controlam a visibilidade e comportamento de classes, métodos e atributos
//	Exemplos: public, private, protected, static, final
	public static void main(String[] args) {
		Professor professor = new Professor("girafales");
		Aluno aluno = new Aluno("Kiko");
		
		System.out.println(aluno.NOME);
		System.out.println(professor.NOME);
		
		System.out.println(aluno.ESPECIE);
		System.out.println(professor.ESPECIE);
		System.out.println(Pessoa.ESPECIE);

//		aluno.fazerProva(professor.gabaritoDaProva);
//		O campo Professor.gabaritoDaProva não está visível
		
		aluno.fazerProva(professor.questoesDaProva);
	}
}
