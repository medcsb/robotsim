package fr.tp.inf112.robotsim.model;

import java.util.ArrayList;

import fr.tp.inf112.robotsim.utils.Coordinates;

public class Room extends Component {

    private String name;
    private ArrayList<Component> machines = new ArrayList<>();
    private ArrayList<Door> doors = new ArrayList<>();
    private ArrayList<Robot> robots = new ArrayList<>();

    public Room(String name, Coordinates coordinates, int width, int height) {
        super(coordinates, width, height);
        this.name = name;
        this.doors = new ArrayList<>();
        this.machines = new ArrayList<>();
        this.robots = new ArrayList<>();
    }

    public void addMachine(Component machine) {
        machines.add(machine);
    }

    public void addDoor(Door door) {
        doors.add(door);
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void removeRobot(Robot robot) {
        robots.remove(robot);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Component> getMachines() {
        return machines;
    }

    public String toString() {
        return "Room [name=" + this.getName() + ", machines={" + this.machinesToString() + "}, doors={"
                + this.doorsToString() + "}]";
    }

    private String machinesToString() {
        String result = "";
        for (Component machine : machines) {
            result += machine.toString();
            if (machines.indexOf(machine) < machines.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }

    private String doorsToString() {
        String result = "";
        for (Door door : doors) {
            result += door.toString();
            if (doors.indexOf(door) < doors.size() - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
