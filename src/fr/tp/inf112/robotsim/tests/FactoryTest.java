package fr.tp.inf112.robotsim.tests;

import fr.tp.inf112.robotsim.model.ChargingStation;
import fr.tp.inf112.robotsim.model.Door;
import fr.tp.inf112.robotsim.model.Factory;
import fr.tp.inf112.robotsim.model.ProductionMachine;
import fr.tp.inf112.robotsim.model.Robot;
import fr.tp.inf112.robotsim.model.Room;
import fr.tp.inf112.robotsim.utils.Coordinates;

public class FactoryTest {
    public static void main(String[] args) {

        // test printing the factory
        Factory factory = new Factory("Factory 1");
        Room room1 = new Room("Room 1", new Coordinates(0, 0), 10, 10);
        Room room2 = new Room("Room 2", new Coordinates(10, 0), 10, 10);
        Door door = new Door(room1, room2, 1, new Coordinates(10, 0), 10, 10);
        factory.addRoom(room1);
        factory.addRoom(room2);
        factory.addDoor(door);
        ProductionMachine prodMachine = new ProductionMachine(0, 15.0, new Coordinates(0, 0), 10, 10);
        factory.addComponentToRoom("Room 1", prodMachine);
        ChargingStation chargingStation = new ChargingStation(1, new Coordinates(0, 0), 10, 10);
        factory.addComponentToRoom("Room 2", chargingStation);
        ProductionMachine prodMachine2 = new ProductionMachine(1, 15.0, new Coordinates(0, 0), 10, 10);
        factory.addComponentToRoom("Room 2", prodMachine2);

        Robot robot = new Robot("Robot 1", 10, new Coordinates(0, 0), 10);
        Robot robot2 = new Robot("Robot 2", 10, new Coordinates(0, 0), 10);
        factory.addRobot(robot);
        factory.addRobot(robot2);
        System.out.println(factory);
    }
}
