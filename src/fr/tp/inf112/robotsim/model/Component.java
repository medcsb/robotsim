package fr.tp.inf112.robotsim.model;

public abstract class Component {

    private int x;
    private int y;
    private int width;
    private int height;

    public Component(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Component [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}
