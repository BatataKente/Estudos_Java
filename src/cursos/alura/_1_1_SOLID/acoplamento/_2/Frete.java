package cursos.alura._1_1_SOLID.acoplamento._2;

public class Frete implements ServicoDeEntrega {
    public double para(final String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }
}
