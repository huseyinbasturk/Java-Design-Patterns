package org.example;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        // set the data value
        s.setData(55);
        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        //get another reference to singleton
        //is it the same object?

        s= null;
        s= Singleton.getInstance();
        System.out.println("\nSecond reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

    }
}
