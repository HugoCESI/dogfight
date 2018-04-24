package fr.exia.gameframe;

import java.util.Observer;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.Observable;

public class GamePanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private IGraphicsBuilder graphicsBuilder;

	public GamePanel(IGraphicsBuilder graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
	}
	
	public void paintComponent(Graphics graphics) {
		this.graphicsBuilder.applyModelToGraphic(graphics, this);
	}

}
