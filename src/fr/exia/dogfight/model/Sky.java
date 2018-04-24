package fr.exia.dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Sky {
	Dimension dimension;
	Image image;

	public Sky(Dimension dimension) {

	}

	public Dimension getDimension() {
		return dimension;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}
}
