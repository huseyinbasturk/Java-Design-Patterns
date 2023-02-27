package org.example;

public interface RobotInterface {
    void print();

    //extrinsic data is passed as argument
    void setColor(String colorOfRobot);
}

class SmallRobot implements RobotInterface{
    @Override
    public void print() {
        System.out.println("This is a small robot");
    }

    @Override
    public void setColor(String colorOfRobot) {

    }

}

class LargeRobot implements RobotInterface{

    @Override
    public void print() {
        System.out.println("This is a large robot");
    }

    @Override
    public void setColor(String colorOfRobot) {
        
    }
}
