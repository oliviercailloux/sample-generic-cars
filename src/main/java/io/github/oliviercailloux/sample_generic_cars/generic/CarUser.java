package io.github.oliviercailloux.sample_generic_cars.generic;

public class CarUser {
	public static void main(String[] args) {
		Car<String> car1 = new Car<>("Enginekind");
		Car<Integer> car2 = new Car<>(3);
		System.out.println(car1.toString());
		System.out.println(car2.toString());
	}

	public static <E> String getEngineAsString(Car<E> car) {
		return car.getEngine().toString();
	}
}
