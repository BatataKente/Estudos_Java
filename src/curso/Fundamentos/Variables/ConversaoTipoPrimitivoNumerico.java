package curso.Fundamentos.Variables;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;
		System.out.print("conversão implícita: " + a + "\n");
		float b = (float)1.011231231231212312;
		System.out.println("CAST: " + b);
		double z = 1.011231231231212312;
		System.out.println(z);
		int c = 4;
		byte d = (byte)c;
		System.out.println(d);
		double e = 1.9999;
		int f = (int)e;
		System.out.println(f);
	}
}
