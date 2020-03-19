package io.github.oliviercailloux.sample_generic_cars.non_generic;

public class CarUser {
	public static void main(String[] args) {
		CarStringEngine car1 = new CarStringEngine("Enginekind");
		CarIntegerEngine car2 = new CarIntegerEngine(3);
		System.out.println(car1.toString());
		System.out.println(car2.toString());
	}

	public static String getEngineAsString(CarStringEngine car) {
		return car.getEngine().toString();
	}

	public static String getEngineAsString(CarIntegerEngine car) {
		return car.getEngine().toString();
	}
}
