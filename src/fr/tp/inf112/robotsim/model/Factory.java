package fr.tp.inf112.robotsim.model;

import java.util.ArrayList;

public class Factory {

    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<Robot> robots;
    private hashMap<Room, Component> roomMap;

    public Factory(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(String name, int x, int y, int width, int height) {
        Room room = new Room(name, x, y, width, height);
        rooms.add(room);
    }

    public boolean addRobot(String name, double speed, int x, int y, int width, int height) {
        if (checkRobotName(name)) {
            robots.add(new Robot(name, 0.0, x, y, width, height));
            return true;
        }
        return false;
    }

    private boolean checkRobotName(String name) {
        for (Robot robot : robots) {
            if (robot.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    public void printToConsole() {
        System.out.println("Factory: " + getFactoryName());
        System.out.println("[Rooms: " + rooms + "]");
        System.out.println("[Robots: " + robots + "]");
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
