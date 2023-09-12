package InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Poligon;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;
import ModelElements.Texture;

public class ModelStore implements IModelChanger {
	public PoligonalModel models;
	public Scene scenes;
	public Flash flashes;
	public Camera cameras;
	private IModelChangeObserver changeObserver;

	public ModelStore(IModelChangeObserver changeObserver) {
		this.changeObserver = changeObserver;

		this.models = new PoligonalModel(new Poligon(null), new Texture());
		this.flashes = new Flash();
		this.cameras = new Camera(null, null);

		this.scenes = new Scene(0, models, flashes, cameras);
	}

	public Scene getScene(int n) {
		return this.scenes;
	}

	@Override
	public void notifyChange(IModelChanger sender) {
	}
}