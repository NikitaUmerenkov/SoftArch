package classes;
import enums.Fuel_Type;
import enums.Gearbox_Type;
import interfaces.iFuelStation;

public class CarGasoline extends Car implements iFuelStation {

	public CarGasoline(String mark, String model, String color, String exter, Fuel_Type fuel_type, Gearbox_Type gearbox,
			int num_wheels, double vol_eng) {
		super(mark, model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
		this.fuel_type = Fuel_Type.GASOLINE;

	}

	@Override
	public void refuel() {
		System.out.println("Full tank of gasoline!");
	}

	@Override
	public void wipWindshield() {
		System.out.println("wipWindshield ON!");
		throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
	}

	@Override
	public void wipHeadlights() {
		System.out.println("wipHeadlights ON!");
		throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
	}

	@Override
	public void wipMirrors() {
		System.out.println("wipMirrors ON!");
		throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
	}
}