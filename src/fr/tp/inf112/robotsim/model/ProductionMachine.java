package fr.tp.inf112.robotsim.model;

import fr.tp.inf112.robotsim.utils.Coordinates;

public class ProductionMachine extends Component {
    private int id;
    private double produceionRate;

    public ProductionMachine(int id, double rate, Coordinates coordinates, int width, int height) {
        super(coordinates, width, height);
        this.id = id;
        this.produceionRate = rate;
    }

    @Override
    public String toString() {
        return "ProductionMachine n:" + id;
    }
}
