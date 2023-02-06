package org.example;

public class Client {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //get an object of shape circle
        Shape shape1 =shapeFactory.getShape("CIRCLE");
        //call draw method of ahpae circle
        shape1.draw();


        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("BLUE");
        color1.fill();
    }
}
