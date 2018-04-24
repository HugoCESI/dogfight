package fr.exia.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private Image images[];
	DogFightModel dogfightModel;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		
	}
	
	public Point getPosition() {
		return null;
	}
	
	public Dimension getDimension() {
		return dimension;
	}
	
	public int getSpeed() {
		return 1;
	}
	
	public int getWidth() {
		return 1;
	}
	
	public int getHeight() {
		return 1;
	}
	
	public void move() {
		
	}
	
	public void placeInArea(IArea area) {
		
	}
	
	public boolean isPlayer(int player) {
		return true;
	}
	
	private void moveUp() {
		
	}
	
	private void moveRight() {
		
	}
	
	private void moveDown() {
		
	}
	
	private void moveLeft() {
		
	}
	
	public Color getColor() {
		return new Color(1);
	}
	
	public IDogFightModel getDogFightModel() {
		return null;
	}
	
	public void setDogFightModel(IDogFightModel dogfightModel) {
		
	}
	
	public boolean hit() {
		return true;
	}
	
	public boolean isWeapon() {
		return true;
	}
	
	public Image getImage() {
		return null;
	}

	@Override
	public void setDogFightModel(DogFightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}
}
