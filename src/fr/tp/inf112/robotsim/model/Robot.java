package fr.tp.inf112.robotsim.model;

public class Robot extends Component {

    private String name;
    private double speed;

    public Robot(String name, double speed, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Robot [name=" + name + ", speed=" + speed + "]";
    }

    public String getName() {
        return name;
    }

}
