package fr.tp.inf112.robotsim.model;

import fr.tp.inf112.robotsim.utils.Coordinates;

public class Robot extends Component {

    private String name;
    private double speed;
    private Coordinates coordinates;

    public Robot(String name, double speed, Coordinates coordinates, int radius) {
        super(coordinates, radius, radius);
        this.name = name;
        this.speed = speed;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Robot [name=" + name + ", speed=" + speed + "]";
    }

    public String getName() {
        return name;
    }

}
