package cursos.alura._1_1_SOLID.heranca._2;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {
        for (ContaComum conta : contasDoBanco()) {
            conta.render();
            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200, true));
    }

    private static ContaComum umaContaCom(final double valor) {
        return umaContaCom(valor, false);
    }

    private static ContaComum umaContaCom(final double valor, final boolean isEstudante) {
        ContaComum contaComum = isEstudante? new ContaComum() : new ContaDeEstudante();
        contaComum.depositar(valor);
//        ContaComum contaComum = isEstudante? new ContaComum(valor) : new ContaDeEstudante(valor);
        return contaComum;
    }
}
