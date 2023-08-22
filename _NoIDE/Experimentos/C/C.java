import java.util.Scanner;

class Baskara {
	private double x_1, x_2;
	private String resposta = "";
	Baskara(double a, double b, double c) {
		try {
			calculate(a, b, c);
			resposta = String.format("Valor de x': %.2f\nValor de x'': %.2f.", x_1, x_2);
		} catch(Exception exception) {
			resposta = String.valueOf(exception.getMessage());
		}
	}
	private void calculate(double a, double b, double c) throws Exception {
		double delta = (b*b) - (4*a*c);
		if(delta < 0) {
			throw new Exception("Nao foi possível executar calculo pois o delta eh negativo");
		}
		x_1 = ((- b) + (Math.pow(delta, 0.5)))/(2*a);
		x_2 = ((- b) - (Math.pow(delta, 0.5)))/(2*a);
	}
	public String toString() {
		return resposta;
	}
}

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			do {
				System.out.println("Este programa eh responsavel por calcular baskara");
				System.out.print("Informe o valor de A: ");
				double a = input.nextDouble();
				System.out.print("Informe o valor de B: ");
				double b = input.nextDouble();
				System.out.print("Informe o valor de C: ");
				double c = input.nextDouble();
				Baskara baskara = new Baskara(a, b, c);
				System.out.println(baskara);
				System.out.print("Deseja continuar? (S/N) ");
				if(input.next().equalsIgnoreCase("n")) break;
			} while(true);
		} catch(Exception exception) {
			System.out.println("Erro: Voce informou um valor invalido");
		}
		input.close();
	}
}