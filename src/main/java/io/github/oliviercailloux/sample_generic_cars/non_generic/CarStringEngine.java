package io.github.oliviercailloux.sample_generic_cars.non_generic;

public class CarStringEngine {
	private String engine;

	public CarStringEngine(String engine) {
		this.engine = engine;
	}

	public String getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car with engine: " + engine.toString();
	}

}
