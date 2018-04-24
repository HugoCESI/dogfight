package fr.exia.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observer;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	public int getGlobalWidth();
	public int getGlobalHeight();
}
