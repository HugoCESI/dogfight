package fr.exia.dogfight.view;

import java.util.Observable;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.model.IDogFightModel;
import fr.exia.gameframe.GameFrame;
import java.lang.Runnable;

public class DogFightView {
	
	EventPerformer eventPerformer = new EventPerformer(null);
	GraphicsBuilder graphicsBuilder = new GraphicsBuilder(null);
	GameFrame gameFrame = new GameFrame("DogFight", eventPerformer, graphicsBuilder, null);
	
	public DogFightView(IOrderPerformer orderPerformer, IDogFightModel dogFightModel, Observable observable) {

	}
}
