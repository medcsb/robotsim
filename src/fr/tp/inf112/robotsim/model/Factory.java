package fr.tp.inf112.robotsim.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Factory {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Robot> robots;
    private HashMap<Room, ArrayList<Component>> roomMap;

    public Factory(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.robots = new ArrayList<>();
        this.roomMap = new HashMap<>();
    }

    public void addComponentToRoom(String roomName, Component component) {
        for (Room room : roomMap.keySet()) {
            if (room.getName().equalsIgnoreCase(roomName)) {
                ArrayList<Component> components = roomMap.get(room);
                if (components == null) {
                    components = new ArrayList<>();
                }
                components.add(component);
                roomMap.put(room, components);
                room.addMachine(component);
            }
        }
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
        // could replace null by enumerating all the components in the room
        this.roomMap.put(room, null);
    }

    public void addDoor(Door door) {
        Room room1 = door.getRoom1();
        Room room2 = door.getRoom2();
        room1.addDoor(door);
        room2.addDoor(door);
    }

    public boolean addRobot(Robot robot) {
        if (checkRobotName(robot.getName())) {
            robots.add(robot);
            return true;
        }
        robot = null;
        return false;
    }

    private boolean checkRobotName(String name) {
        for (Robot robot : robots) {
            if (robot.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "Factory name=" + name + " \n\n";
        result += "Rooms: \n\n";
        for (Room room : rooms) {
            result += room.toString() + "\n";
        }
        result += "\n\nRobots: \n\n";
        for (Robot robot : robots) {
            result += robot.toString() + "\n";
        }

        return result;
    }

    public String getFactoryName() {
        return name;
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
}
