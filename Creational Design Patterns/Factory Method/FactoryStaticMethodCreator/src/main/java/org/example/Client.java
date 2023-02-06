package org.example;

public class Client {

    public static void main(String[] args) {

        //get an object of circle and call its draw method
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        //call draw method of Circle
        shape1.draw();

        //get an object of rectangle and call its draw method
        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        //call draw method of Circle
        shape2.draw();

        //get an object of square and call its draw method
        Shape shape3 = ShapeFactory.getShape("SQUARE");
        //call draw method of Circle
        shape3.draw();

    }
}
