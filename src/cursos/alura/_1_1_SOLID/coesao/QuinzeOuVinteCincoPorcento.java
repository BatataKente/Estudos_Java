package cursos.alura._1_1_SOLID.coesao;

public class QuinzeOuVinteCincoPorcento implements RegraDeCalculo {

    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalario() > 2000.0) {
            return funcionario.getSalario() * 0.75;
        }
        else {
            return funcionario.getSalario() * 0.85;
        }
    }
}
