package org.example;

public class Client {
    public static void main(String[] args) throws Exception {
        AnimalFactoryInterface shapeFactory = new ConcreteFactory();


        AnimalInterface animal1 = shapeFactory.getAnimalType("TIGER");

        animal1.walk();


        AnimalInterface animal2 = shapeFactory.getAnimalType("DUCK");

        animal2.walk();


    }
}
