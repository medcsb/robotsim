package fr.tp.inf112.robotsim.tests;

import fr.tp.inf112.robotsim.model.Factory;

public class FactoryTest {
    public static void main(String[] args) {

        Factory factory = new Factory("freeee");
        factory.addRoom("prod", 0, 0, 10, 10);
        factory.addRoom("nde", 10, 10, 10, 10);

        System.out.println(factory);
    }
}
