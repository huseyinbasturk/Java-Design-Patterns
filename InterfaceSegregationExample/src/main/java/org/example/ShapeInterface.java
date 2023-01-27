package org.example;

public interface ShapeInterface {
    public double area();


}

interface SolidShapeInterface{
    public double volume();
}

interface ManageShapeInterface{
    public double calculate();
}
class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface{

    @Override
    public double area() {
        //calculate the surface area of the cuboid
        return 1.0;
    }

    @Override
    public double volume() {
        //calculate the volume of the cuboid
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();

    }
}

class Square implements ShapeInterface, ManageShapeInterface{
    @Override
    public double area() {
        //calculate the surface area of the cuboid
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();

    }
}