package fr.exia.dogfight.view;

import java.awt.event.KeyEvent;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.controller.UserOrder;
import fr.exia.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	@Override
	public void eventPerform(KeyEvent keyEvent) {
		int keyCode = keyEvent.getKeyCode();
		keyCodeToUserOrder(keyCode);
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		
		switch (keyCode) {
		case :
			return new UserOrder(1, "UP");
			break;
			
		case 2:
			return new UserOrder(2, "UP");
			break;	
			
		default:
			break;
		}
		;
	}
	
}
