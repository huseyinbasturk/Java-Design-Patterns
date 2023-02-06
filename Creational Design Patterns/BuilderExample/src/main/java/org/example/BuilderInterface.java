package org.example;

public interface BuilderInterface {
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class Car implements BuilderInterface{
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("2 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }

}


class Motorcycle implements BuilderInterface {
    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        product.add("1 headlights are added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }




}