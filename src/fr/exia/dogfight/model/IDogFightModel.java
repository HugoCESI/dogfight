package fr.exia.dogfight.model;

import java.util.ArrayList;

public interface IDogFightModel {
	public IArea getArea();
	public void buildArea(IMobile Mobile);
	public void removeMobile(IMobile Mobile);
	public ArrayList<IMobile> getMobiles();
	public IMobile getMobileByPlayer(int player);
	public void setMobilesHavesMoved();
	
}
