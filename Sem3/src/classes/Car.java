package classes;

import enums.Fuel_Type;
import enums.Gearbox_Type;

/**
 * Спроектировать абстрактный класс «Car» у которого должны быть свойства:
 * марка, модель, цвет, тип кузова, число колёс, тип топлива, тип коробки
 * передач, объём двигателя; методы: движение, обслуживание, переключение
 * передач, включение фар, включение дворников.
 */
public abstract class Car {
	protected String mark;
	protected String model;
	protected String color;
	protected String exter;
	protected Fuel_Type fuel_type;
	protected Gearbox_Type gearbox;
	protected int num_wheels;
	protected double vol_eng;

	private boolean light_on = false;
	private boolean wipers_on = false;

	/**
	 * @param mark       - марка производителя (Toyota, Москвич, …)
	 * @param model      - модель авто в модельном ряду производителя
	 * @param color      - цвет кузова
	 * @param exter      - тип кузова
	 * @param fuel_type  - вид топлива
	 * @param gearbox    - тип коробки передач
	 * @param num_wheels - число колес
	 * @param vol_eng    - объем двигателя
	 */
	public Car(
			String mark,
			String model,
			String color,
			String exter,
			Fuel_Type fuel_type,
			Gearbox_Type gearbox,
			int num_wheels,
			double vol_eng) {
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.exter = exter;
		this.fuel_type = fuel_type;
		this.gearbox = gearbox;
		this.num_wheels = num_wheels;
		this.vol_eng = vol_eng;
	}

	// метод ДВИЖЕНИЕ
	public String movement() {
		return "moving";
	}

	// метод ОБСЛУЖИВАНИЕ
	protected String service() {
		return "";
	}

	// метод ПЕРЕКЛЮЧЕНИЕ ПЕРЕДАЧ
	public void changeGearbox(String gearbox_mode) {
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ФАР
	public boolean turnLights(boolean light_on) {
		light_on = !light_on;
		return light_on;
	}

	// метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ ДВОРНИКОВ
	public boolean turnWipers(boolean wipers_on) {
		wipers_on = !wipers_on;
		return wipers_on;
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", model=" + model + ", color=" + color + ", exter=" + exter + ", fuel_type="
				+ fuel_type + ", gearbox=" + gearbox + ", num_wheels=" + num_wheels + ", vol_eng=" + vol_eng
				+ ", light_on=" + light_on + ", wipers_on=" + wipers_on + "]";
	}
}