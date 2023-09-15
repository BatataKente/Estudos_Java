package cursos.alura.java_util.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.*;

public class TesteSort1 {
	
        public static void main(String[] args) {

                Conta cc1 = new ContaCorrente(22, 33);
                cc1.depositar(333.0);

                Conta cc2 = new ContaPoupanca(22, 44);
                cc2.depositar(444.0);

                Conta cc3 = new ContaCorrente(22, 11);
                cc3.depositar(111.0);

                Conta cc4 = new ContaPoupanca(22, 22);
                cc4.depositar(222.0);

                List<Conta> lista = new ArrayList<Conta>();
                lista.add(cc1);
                lista.add(cc2);
                lista.add(cc3);
                lista.add(cc4);
                
//                NumeroDaContaComparator comparator = new NumeroDaContaComparator();
                
                System.out.println(Arrays.toString(lista.toArray()));
//              lista.sort(comparator);
//                System.out.println(Arrays.toString(lista.toArray()));
        }
}