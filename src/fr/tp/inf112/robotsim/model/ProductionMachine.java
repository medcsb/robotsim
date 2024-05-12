package fr.tp.inf112.robotsim.model;

public class ProductionMachine extends Component {
    private int id;

    public ProductionMachine(int id, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductionMachine : " + id;
    }
}
