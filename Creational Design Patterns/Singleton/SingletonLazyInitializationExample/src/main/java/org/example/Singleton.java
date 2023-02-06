package org.example;

public class Singleton {

    //private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    //an instance attribute
    private int data = 0;

    private Singleton(){
    }

    public static  Singleton getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;

    }
    public void setData(int myData){
        data = myData;
    }

    public int getData(){
        return data;
    }
}