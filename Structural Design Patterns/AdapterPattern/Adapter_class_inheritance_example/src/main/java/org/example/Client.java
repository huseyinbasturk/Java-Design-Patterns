package org.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("****Class and Object Demo***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is running: " + ca1.getInteger());

        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + oa.getInteger());

    }
}
