package org.example;

public class Client {
    public static void main(String[] args) throws Exception{
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        RobotInterface shape = myFactory.getRobotFRomFactory("small");
        shape.print();

        for(int i=0; i < 2; i++){
            shape = myFactory.getRobotFRomFactory("small");
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created " + numOfDistinctRobots);


        for(int i=0; i <5; i++){
            shape = myFactory.getRobotFRomFactory("large");
            shape.print();
        }

        numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created " + numOfDistinctRobots);
    }
}