package fr.exia.dogfight.controller;

public class UserOrder implements IUserOrder {
	private int player;
	Order order;

	public Order getOrder() {
		return order;
	}

	public UserOrder(int player, Order order) {

	}

	public void setPlayer(int player) {
		this.player = player;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

}
