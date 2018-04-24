package fr.exia.dogfight.model;

import java.util.ArrayList;

public class DogFightModel implements IDogFightModel {
	private Sky sky;
	private ArrayList<IMobile> mobiles;

	public void DogFightModel() {
		this.setSky(new Sky(null));
	}

	public IArea getArea() {
		return (IArea) sky;
	}

	public void buildArea(Dimension dimension) {

	}

	public void addMobile(IMobile Mobile) {

	}

	public void removeMobile(IMobile Mobile) {

	}

	public ArrayList<IMobile> getMobiles() {
		return mobiles;
	}

	public void setMobilesHavesMoved() {

	}

	@Override
	public void buildArea(IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sky getSky() {
		return sky;
	}

	public void setSky(Sky sky) {
		this.sky = sky;
	}
}
