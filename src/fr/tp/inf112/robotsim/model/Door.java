package fr.tp.inf112.robotsim.model;

import fr.tp.inf112.robotsim.utils.Coordinates;

public class Door extends Component {
    private Room room1;
    private Room room2;
    private int id;

    public Door(Room room1, Room room2, int id, Coordinates coordinates, int width, int height) {
        super(coordinates, width, height);
        this.id = id;
        this.room1 = room1;
        this.room2 = room2;
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }

    @Override
    public String toString() {
        return "Door n:" + id;
    }
}
