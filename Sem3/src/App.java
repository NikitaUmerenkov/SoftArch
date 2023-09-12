import classes.CarDiesel;
import classes.CarFogFreight;
import classes.CarGasoline;
import classes.FlyingCar;
import classes.Sedan;
import classes.StreetCleaningCar;
import enums.Fuel_Type;
import enums.Gearbox_Type;

public class App {
	public static void main(String[] args) {
		/**
		 * Создать конкретный автомобиль путём наследования класса «Car».
		 */
		Sedan myCar1 = new Sedan("Toyota", "Crown", "white", "universal", Fuel_Type.GASOLINE, Gearbox_Type.AT, 4, 2.0);
		System.out.println("myCar1");
		System.out.println(myCar1);

		StreetCleaningCar myCar2 = new StreetCleaningCar("Cat", "buldozer", "yellow", "box", Fuel_Type.DIESEL,
				Gearbox_Type.MT, 6, 12.7);

		// метем улицу
		myCar2.cleaning();
		// перестаем мести улицу
		myCar2.cleaning();

		System.out.println();

		CarFogFreight myCar3 = new CarFogFreight("MAZ", "Perestroika", "red", "trailler", Fuel_Type.DIESEL,
				Gearbox_Type.AT, 18, 40.0);

		// мигаем противотуманками, и транспарантом "ГРУЖЕНЫЙ"
		myCar3.fog();
		myCar3.freight();
		myCar3.freight();
		myCar3.fog();

		System.out.println();
		Sedan myCar4 = new Sedan("Toyota", "Crown", "white", "universal", Fuel_Type.GASOLINE, Gearbox_Type.AT, 3, 2.0);
		System.out.println("Number of wheels");
		System.out.println(myCar4);

		System.out.println();
		FlyingCar myCar5 = new FlyingCar("Flipper", "FutureGuest", "RED", "shpere", Fuel_Type.DIESEL, Gearbox_Type.AT,
				0, 1200);
		System.out.println("In the sky?");
		System.out.println("myCar4");
		System.out.println(myCar4.movement());

		System.out.println();

		System.out.println("myCar5");
		System.out.println(myCar5.movement());
		System.out.println(myCar5);

		System.out.println();
		CarDiesel myCar6 = new CarDiesel("Patriot", "Camry", "blue", "sedan", Fuel_Type.ATOMIC, Gearbox_Type.MT, 3,
				2.5);
		System.out.println(myCar6);

		CarGasoline myCar7 = new CarGasoline("Lada", "Kalina", "green", "sedan", Fuel_Type.DIESEL, Gearbox_Type.MT, 5,
				1.5);

		System.out.println("====================================");

		System.out.println("====================================");

		System.out.println("myCar6.refuel");
		myCar6.refuel();

		System.out.println();

		System.out.println("myCar7.refuel");
		myCar7.refuel();
	}
}