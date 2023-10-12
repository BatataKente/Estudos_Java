package cursos.alura._1_1_SOLID.acoplamento._2;

public class TabelaDePrecoPadrao implements TabelaDePreco {
    public double descontoPara(final double valor) {
        if(valor>5000) return 0.03;
        if(valor>1000) return 0.05;
        return 0;
    }
}
