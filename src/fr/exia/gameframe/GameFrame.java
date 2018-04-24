package fr.exia.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private IEventPerformer eventPerformer;

	public GameFrame(String title, IEventPerformer eventPerformer, IGraphicsBuilder graphicsBuilder, Observable observable) {
		this.setTitle("Dogfight");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);

		this.setContentPane(new GamePanel(graphicsBuilder));
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		observable.addObserver((Observer) graphicsBuilder);
		
		this.eventPerformer = eventPerformer;
	}

	public void keyPressed(KeyEvent keyEvent) {
		this.eventPerformer.eventPerform(keyEvent);
	}

	public void keyReleased(KeyEvent keyEvent) {
		this.eventPerformer.eventPerform(keyEvent);
	}

	public void keyTyped(KeyEvent keyEvent) {
		this.eventPerformer.eventPerform(keyEvent);
	}
}
