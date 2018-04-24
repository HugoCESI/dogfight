package fr.exia.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
	private int speed;
	private Direction direction;
	private Position position;
	private Dimension dimension;
	private Image images[];
	DogFightModel dogfightModel;
	final Point point;

	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
		this.point = new Point();
		point.setLocation(position.getX(), position.getY());
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public Point getPosition() {
		return this.point.getLocation();
	}

	public Dimension getDimension() {
		return dimension;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getWidth() {
		return this.dimension.getWidth();
	}

	public int getHeight() {
		return this.dimension.getHeight();
	}

	public void move() {
		if (direction == Direction.LEFT) {
			moveLeft();
		} else if (direction == Direction.RIGHT) {
			moveRight();
		} else if (direction == Direction.DOWN) {
			moveDown();
		} else if (direction == Direction.UP) {
			moveUp();
		}
	}

	public void placeInArea(IArea area) {

	}

	public boolean isPlayer(int player) {
		return true;
	}

	private void moveUp() {
		this.point.setLocation(this.position.getX(), this.position.getY() - 1);
	}

	private void moveRight() {
		this.point.setLocation(this.position.getX() + 1, this.position.getY());
	}

	private void moveDown() {
		this.point.setLocation(this.position.getX(), this.position.getY() + 1);
	}

	private void moveLeft() {
		this.point.setLocation(this.position.getX() - 1, this.position.getY());
	}

	/*
	 * public Color getColor() { return new Color(1); }
	 */

	public IDogFightModel getDogFightModel() {
		return null;
	}

	public void setDogFightModel(IDogFightModel dogfightModel) {
		
	}

	public boolean hit() {
		return false;
	}

	public boolean isWeapon() {
		return false;
	}

	public Image getImage() {
		return null;
	}

	@Override
	public void setDogFightModel(DogFightModel dogfightModel) {
		// TODO Auto-generated method stub

	}
}
