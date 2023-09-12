package classes;
import enums.Fuel_Type;
import enums.Gearbox_Type;

public class FogLights extends Car {
    protected boolean foglights_on = false;

    public FogLights(String mark, String model, String color, String exter, Fuel_Type fuel_type, Gearbox_Type gearbox,
            int num_wheels, double vol_eng) {
        super(mark, model, color, exter, fuel_type, gearbox, num_wheels, vol_eng);
        //TODO Auto-generated constructor stub
    }

      // метод ВКЛЮЧЕНИЯ/ВЫКЛЮЧЕНИЯ УБОРКИ УЛИЦЫ
	public boolean fog_on(boolean foglights_on) {
		foglights_on = !foglights_on;
		return foglights_on;
	}
    
}