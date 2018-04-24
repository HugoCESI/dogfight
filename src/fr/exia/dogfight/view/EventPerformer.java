package fr.exia.dogfight.view;

import java.awt.event.KeyEvent;

import fr.exia.dogfight.controller.IOrderPerformer;
import fr.exia.dogfight.controller.Order;
import fr.exia.dogfight.controller.UserOrder;
import fr.exia.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {
	
	private IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	@Override
	public void eventPerform(KeyEvent keyCode) {
		orderPerformer.orderPerform(userOrder);
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		switch (keyCode) {
		case 90:
			return new UserOrder(1, Order.UP);
		case 81:
			return new UserOrder(1, Order.LEFT);
		case 83:
			return new UserOrder(1, Order.DOWN);
		case 68:
			return new UserOrder(1, Order.RIGHT);
		case 8:
			return new UserOrder(1, Order.SHOOT);
		case 38:
			return new UserOrder(2, Order.UP);
		case 37:
			return new UserOrder(2, Order.LEFT);
		case 40:
			return new UserOrder(2, Order.DOWN);
		case 39:
			return new UserOrder(2, Order.RIGHT);
		case 96:
			return new UserOrder(1, Order.SHOOT);
		}
		return null;
	}
	
}
