package org.example;
interface AnimalInterface {
    void walk();
}

class Duck implements AnimalInterface{

    @Override
    public void walk() {
        System.out.println("Duck is walking... paytak paytak");
    }
}

class Tiger implements AnimalInterface{

    @Override
    public void walk() {
        System.out.println("Tiger is walking");
    }
}

