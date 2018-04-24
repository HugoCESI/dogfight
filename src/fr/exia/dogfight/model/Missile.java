package fr.exia.dogfight.model;
public class Missile extends Mobile {
    private static int SPEED = 4;
    private static int WIDTH = 30;
    private static int HEIGHT = 40;
    private static int MAX_DISTANCE_TRAVELED = 1400;
    private static String IMAGE = "missile";
    private int distanceTraveled = 0;
    
    public Missile(Direction direction, Dimension dimension, Position position) {
        super(direction, position, dimension, SPEED, IMAGE);
    }
    
    public static int getWidthWithADirection(Direction direction) {
        return 1;
    }
    
    public static int getHeightWithADirection(Direction direction) {
        return 1;
    }
    
    public void move() {
        
    }
    
    public boolean isWeapon() {
        return true;
    }
}