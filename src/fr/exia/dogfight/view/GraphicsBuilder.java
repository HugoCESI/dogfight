package fr.exia.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import fr.exia.dogfight.model.IDogFightModel;
import fr.exia.dogfight.model.IMobile;
import fr.exia.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	
	IDogFightModel dogFightModel;
	BufferedImage bufferedImage = new BufferedImage(null, null, false, null);
	
	public GraphicsBuilder(IDogFightModel dogFightModel) {
		
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver imageObserver) {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver imageObserver) {
		
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 1;
	}
}
