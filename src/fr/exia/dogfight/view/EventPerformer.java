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
	public void eventPerform(KeyEvent keyCode) {
		// TODO Auto-generated method stub
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return new UserOrder(1, null);
	}
	
}
