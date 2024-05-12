package fr.tp.inf112.robotsim.model;

public class ChargingStation extends Component {

    private int id;

    public ChargingStation(int id, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.id = id;
    }

    @Override
    public String toString() {
        return "ChargingStation : " + id;
    }
}