package fr.tp.inf112.robotsim.model;

import fr.tp.inf112.robotsim.utils.Coordinates;

public abstract class Component {

    private Coordinates coordinates;
    private int width;
    private int height;

    public Component(Coordinates coordinates, int width, int height) {
        this.coordinates = coordinates;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Component [x=" + coordinates.getX() + ", y=" + coordinates.getY() + ", width=" + width + ", height="
                + height + "]";
    }
}
