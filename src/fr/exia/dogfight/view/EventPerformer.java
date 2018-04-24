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
	public void eventPerform(KeyEvent keyEvent) {
		int keyCode = keyEvent.getKeyCode();
		keyCodeToUserOrder(keyCode);
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		
		int player = 0;
		Order order = null;
		
		switch (keyCode) {
		case KeyEvent.KEY_PRESSED:
			switch(keyCode) {
	        case KeyEvent.VK_RIGHT :
	            order = Order.RIGHT;
	            player = 1;
	            break;
	
	        case KeyEvent.VK_LEFT:
	            order = Order.LEFT;
	            player = 1;
	            break;
	
	        case KeyEvent.VK_DOWN:
	            order = Order.DOWN;
	            player = 1;
	            break;
	
	        case KeyEvent.VK_UP:
	            order = Order.UP;
	            player = 1;
	            break;
	
	        case KeyEvent.VK_Z:
	            order = Order.UP;
	            player = 2;
	            break;
	
	        case KeyEvent.VK_D:
	            order = Order.RIGHT;
	            player = 2;
	            break;
	
	        case KeyEvent.VK_Q:
	            order = Order.LEFT;
	            player = 2;
	            break;
	
	        case KeyEvent.VK_S:
	            order = Order.DOWN;
	            player = 2;
	            break;
		
	        default:
	            order = Order.NOP;
	        }
			break;
			
		case KeyEvent.KEY_RELEASED:
			
			order = Order.NOP;
			
			switch(keyCode) {
	        case KeyEvent.VK_RIGHT :
	            player = 1;
	            break;
	
	        case KeyEvent.VK_LEFT:
	            player = 1;
	            break;
	
	        case KeyEvent.VK_DOWN:
	            player = 1;
	            break;
	
	        case KeyEvent.VK_UP:
	            player = 1;
	            break;
	
	        case KeyEvent.VK_Z:
	            player = 2;
	            break;
	
	        case KeyEvent.VK_D:
	            player = 2;
	            break;
	
	        case KeyEvent.VK_Q:
	            player = 2;
	            break;
	
	        case KeyEvent.VK_S:
	            player = 2;
	            break;
	
	        default:
	            order = Order.NOP;
	        }
			break;
		
		case KeyEvent.KEY_TYPED:
			switch (keyCode) {
			case KeyEvent.VK_0:
				order = Order.SHOOT;
				player = 1;
				break;
				
			case KeyEvent.VK_SPACE:
				order = Order.SHOOT;
				player = 2;
				break;
				
			}
		}
		
        return new UserOrder(player , order);
	}
	
}
