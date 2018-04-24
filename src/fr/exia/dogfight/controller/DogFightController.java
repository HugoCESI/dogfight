package fr.exia.dogfight.controller;

import fr.exia.dogfight.model.IDogFightModel;
import fr.exia.dogfight.view.DogFightView;
import fr.exia.dogfight.view.IViewSystem;

public class DogFightController implements IOrderPerformer {
	private static int TIME_SLEEP = 30;
	private IDogFightModel dogFightModel;
	private IViewSystem viewSystem;
	
	public DogFightController(IDogFightModel dogFightModel) {
		this.dogFightModel = dogFightModel;
	}
	public void orderPerform(UserOrder userOrder) {
		
	}
	public void play() {
		
	}
	public void setViewSystem(IViewSystem viewSystem) {
		this.viewSystem = viewSystem;
	}
	private void lauchMissile(int player) {
		
	}
	private void gameLoop() {
		
	}
	 
}
