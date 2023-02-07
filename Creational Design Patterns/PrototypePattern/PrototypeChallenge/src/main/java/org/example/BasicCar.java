package org.example;

import java.util.Random;

abstract class BasicCar implements Cloneable{
    protected String modelName;
    public int price;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public static int setPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar) super.clone();
    }


}

class Ford extends BasicCar {
    public Ford(String m) {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }
}

class Nano extends BasicCar {
    public Nano(String m) {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Nano)super.clone();
    }
}