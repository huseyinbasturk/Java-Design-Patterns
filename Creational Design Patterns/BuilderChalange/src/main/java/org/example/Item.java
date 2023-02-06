package org.example;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}

abstract class Burger implements Item{

    public Packing packing(){
        return new Wrapper();
    }

    public abstract float price();
}

class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

class ChickerBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}

abstract class ColdDrink implements Item {

    public Packing packing(){
        return new Bottle();
    }

    public abstract float price();

}

class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}

class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.6f;
    }
}

interface Packing {
    public String pack();
}

class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}

