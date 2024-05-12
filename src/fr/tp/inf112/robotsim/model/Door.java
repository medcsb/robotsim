package fr.tp.inf112.robotsim.model;

public class Door extends Component {
    private Room room;
    private int id;

    public Door(Room room, int id, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.room = room;
        this.id = id;
    }

}
