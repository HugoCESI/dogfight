package fr.exia.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer eventPerformer, IGraphicsBuilder graphicsBuilder, Observable observable) {
		this.eventPerformer = eventPerformer;
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
	      eventPerformer.eventPerform(keyEvent);

		
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		eventPerformer.eventPerform(keyEvent);
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		eventPerformer.eventPerform(keyEvent);
		
	}

}	
