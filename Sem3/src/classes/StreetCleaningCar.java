package classes;
import enums.Fuel_Type;
import enums.Gearbox_Type;

/** Расширить абстрактный класс «Car», добавить метод: подметать улицу. */
public class StreetCleaningCar extends Car {
	public boolean cleaning_on = false;

	public StreetCleaningCar(String mark, String model, String color, String exter, Fuel_Type fuel_type,
			Gearbox_Type gearbox, int num_wheels, double vol_eng) {
		super(mark, model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ УБОРКИ УЛИЦЫ
	public boolean cleaning() {
		cleaning_on = !cleaning_on;
		System.out.println("Cleaning");
		System.out.println(cleaning_on ? "yes" : "no");
		return cleaning_on;
	}
}