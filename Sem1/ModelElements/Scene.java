package ModelElements;

public class Scene {
	public int ID;
	public PoligonalModel models;
	public Flash flashes;
	public Camera cameras;

	public Scene(int id, PoligonalModel models, Flash flashes, Camera cameras) {
		this.ID = id;
		this.models = models;
		this.flashes = flashes;
		this.cameras = cameras;
	}

	public <T> T method1(T flash) {
		return flash;
	}

	public <T, E> T method2(T Model, E Flash) {
		return Model;
	}