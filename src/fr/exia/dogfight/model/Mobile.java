package fr.exia.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		
	}
	
	public Point getPosition() {
		return position;
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
		
	}
	
	public IDogFightModel getDogFightModel() {
		
	}
	
	public void setDogFightModel(IDogFightModel dogfightModel) {
		
	}
	
	public boolean hit() {
		
	}
	
	public boolean isWeapon() {
		
	}
	
	public Image getImage() {
		
	}
}
