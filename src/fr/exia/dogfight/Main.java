package fr.exia.dogfight;

import fr.exia.dogfight.controller.DogFightController;
import fr.exia.dogfight.model.DogFightModel;
import fr.exia.dogfight.view.DogFightView;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DogFightModel dogfightModel = new DogFightModel();
		final DogFightController dogfightController = new DogFightController(dogfightModel);
		final DogFightView dogfightView = new DogFightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}

}
