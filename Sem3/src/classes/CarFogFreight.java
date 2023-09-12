package classes;
import enums.Fuel_Type;
import enums.Gearbox_Type;
import interfaces.iFogLigths;
import interfaces.iFreighter;

public class CarFogFreight extends Car implements iFogLigths, iFreighter {
	public boolean foglights_on = false;
	public boolean freight_on = false;

	public CarFogFreight(String mark, String model, String color, String exter, Fuel_Type fuel_type,
			Gearbox_Type gearbox, int num_wheels, double vol_eng) {
		super(mark, model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ПРОТИВОТУМАННЫХ ФАР
	@Override
	public boolean fog() {
		foglights_on = !foglights_on;
		System.out.println("Foglights on:");
		System.out.println(foglights_on ? "yes" : "no");
		return foglights_on;
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ПЕРЕВОЗКИ ГРУЗА
	@Override
	public boolean freight() {
		freight_on = !freight_on;
		System.out.println("Freight on board:");
		System.out.println(freight_on ? "yes" : "no");
		return freight_on;
	}
}