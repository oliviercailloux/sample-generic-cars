package io.github.oliviercailloux.sample_generic_cars.generic;

public class Car<E> {
	private E engine;

	public Car(E engine) {
		this.engine = engine;
	}

	public E getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car with engine: " + engine.toString();
	}
}
