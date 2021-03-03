package io.github.oliviercailloux.sample_generic_cars.generic;

public class CarUser {
	public static void main(String[] args) {
		Car<String> car1 = new Car<>("Enginekind");
		Car<Integer> car2 = new Car<>(3);
		System.out.println(car1.toString());
		System.out.println(car2.toString());

		String stringEngineCar1 = CarUser.getEngineAsString(car1);
		System.out.println(stringEngineCar1);
		/*
		 * We may specify explicitly the type E, as follows, but it is not necessary
		 * (and not recommended) as the compiler can deduce it for us.
		 */
		String stringEngineCar2 = CarUser.<Integer>getEngineAsString(car2);
		System.out.println(stringEngineCar2);
	}

	public static <E> String getEngineAsString(Car<E> car) {
		return car.getEngine().toString();
	}
}
