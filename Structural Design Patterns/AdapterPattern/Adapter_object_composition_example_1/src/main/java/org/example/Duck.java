package org.example;

interface Duck {
    public void quack();
    public void fly();
}

class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("flying");

    }
}
