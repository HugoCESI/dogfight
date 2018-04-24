package fr.exia.dogfight.controller;

import fr.exia.dogfight.model.IDogFightModel;
import fr.exia.dogfight.model.IMobile;
import fr.exia.dogfight.model.Missile;
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
	private boolean isWeaponOnMobile(IMobile mobile, IMobile weapon) {
		if (weapon.getPosition().getX() <= mobile.getPosition().getX()+ mobile.getWidth() && weapon.getPosition().getX() + weapon.getWidth() >= mobile.getPosition().getX() 
			&& weapon.getPosition().getY() <= mobile.getPosition().getY()+ mobile.getHeight() && weapon.getPosition().getY() + weapon.getHeight() >= mobile.getPosition().getY()) {
			return true;
		}
		return false;
	}
	private void manageCollision(boolean isWeaponOnMobile, Missile weapon) {
		if (isWeaponOnMobile == true) {
			
		}
	}
}
