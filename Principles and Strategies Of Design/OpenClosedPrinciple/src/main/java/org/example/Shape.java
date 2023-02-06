package org.example;

public interface Shape {
    public double calculateArea();
}
class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}

class Circle implements Shape{
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator{
   public double calculateShapeArea(Shape shape){
       return shape.calculateArea();
   }
}

