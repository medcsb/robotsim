package fr.tp.inf112.robotsim.utils;

public class Coordinates {

    private int x;
    private int y;
    private final int[] coordinates = new int[2];

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void updateCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void updateX(int x) {
        this.x = x;
    }

    public void updateY(int y) {
        this.y = y;
    }

    public int[] getCoordinates() {
        coordinates[0] = x;
        coordinates[1] = y;
        return coordinates;
    }
}
