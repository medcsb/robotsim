package fr.tp.inf112.robotsim.model;

import fr.tp.inf112.robotsim.utils.Coordinates;

public class ChargingStation extends Component {

    private int id;

    public ChargingStation(int id, Coordinates coordinates, int width, int height) {
        super(coordinates, width, height);
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChargingStation n:" + id;
    }
}