package org.example;

interface Turkey {
    public void gobble();
    public void fly();
}

class WildTurkey implements Turkey{

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Flying a short distance");

    }
}
