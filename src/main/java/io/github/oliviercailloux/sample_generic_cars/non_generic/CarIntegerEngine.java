package io.github.oliviercailloux.sample_generic_cars.non_generic;

public class CarIntegerEngine {
	private Integer engine;

	public CarIntegerEngine(Integer engine) {
		this.engine = engine;
	}

	public Integer getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Car with engine: " + engine.toString();
	}

}
