package org.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("***BRIDGE PATTERN***");

        //coloring green to triangle
        System.out.println("\nColoring Triangle");
        ColorInterface green = new GreenColor();
        Shape triangleShape = new Triangle(green);
        triangleShape.drawShape(20);
        triangleShape.modifyBorder(20,3);

        //coloring red to triangle
        System.out.println("\nColoring Triangle");
        ColorInterface red = new GreenColor();
        Shape rectangleShape = new Triangle(green);
        rectangleShape.drawShape(50);
        rectangleShape.modifyBorder(50,2);


    }
}
