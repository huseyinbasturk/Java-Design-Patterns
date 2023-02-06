package org.example;

public abstract class AnimalFactoryInterface {
    public abstract AnimalInterface getAnimalType(String type) throws Exception;
}

class ConcreteFactory extends AnimalFactoryInterface {

    //use getShape method to get object of type shape
    public AnimalInterface getAnimalType(String animalType) throws Exception{
        if(animalType == null){
            return null;
        } else if (animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        } else if (animalType.equalsIgnoreCase("TIGER")){
            return new Tiger();
        } else {
            return null;
        }
    }
}
