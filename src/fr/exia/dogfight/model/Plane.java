package fr.exia.dogfight.model;
public class Plane extends Mobile{  
    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;
    
    public Plane(int player, Direction direction, Position position, String image, Dimension dimension) {
        super(direction, position, dimension, player, image);
    }
    public boolean isPlayer(int player) {
        return true;
    }
    public boolean hit() {
        return true;
    }
    
}