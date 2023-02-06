package org.example;

public class Client {

    public static void main(String[] args) {
        //get an object of circle and call its draw method
        Shape shape1 = new CircleFactory().getShape();
        shape1.draw();

        //get an object of rectangle and call its draw method
        Shape shape2 = new RectangleFactory().getShape();
        shape2.draw();

        //get an object of square and call its draw method
        Shape shape3 = new SquareFactory().getShape();
        shape3.draw();
    }
}
