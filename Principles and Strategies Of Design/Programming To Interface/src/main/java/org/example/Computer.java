package org.example;

interface displayModule{
    public void display();
}

class Monitor implements displayModule{


    @Override
    public void display() {
        System.out.println("Display through monitor");
    }
}
class Project implements displayModule{

    @Override
    public void display() {
        System.out.println("Display through projecter");
    }
}
public class Computer{
    displayModule dm;

    public void setDm(displayModule dm) {
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }

    public static void main(String args[]){
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm1 = new Project();

        cm.setDm(dm);
        cm.display();
        cm.setDm(dm1);
        cm.display();
    }
}