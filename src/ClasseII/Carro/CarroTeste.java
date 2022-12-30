package ClasseII.Carro;

public class CarroTeste {
	public static void main(String[] args) {
		var firstCar = new Carro();
		System.out.println(firstCar.isLigado());
		firstCar.ligar();
		System.out.println(firstCar.isLigado());
		System.out.println(firstCar.motor.giros());
		firstCar.acelerar();
		firstCar.acelerar();
		firstCar.acelerar();
		firstCar.acelerar();
		System.out.println(firstCar.motor.giros());
		firstCar.frear();
		firstCar.frear();
		firstCar.frear();
		firstCar.frear();
		System.out.println(firstCar.motor.giros());
	}
}
