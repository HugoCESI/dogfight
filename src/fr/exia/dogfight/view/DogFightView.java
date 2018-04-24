package fr.exia.dogfight.view;

import java.util.Observable;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.model.IDogFightModel;
import fr.exia.gameframe.GameFrame;
import java.lang.Runnable;

public class DogFightView implements IViewSystem {
	
	EventPerformer eventPerformer;
	GraphicsBuilder graphicsBuilder;
	GameFrame gameFrame;
	
	public DogFightView(IOrderPerformer orderPerformer, IDogFightModel dogFightModel, Observable observable) {
		this.eventPerformer = new EventPerformer(orderPerformer);
		this.graphicsBuilder = new GraphicsBuilder(dogFightModel);
		this.gameFrame = new GameFrame("DogFight", eventPerformer, graphicsBuilder, observable);
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}
}
