package org.example;

public class Singleton {

    //an instance attribute
    private int data = 0;

    private Singleton(){
    }

    private static class SingletonHelper{
        //nested class is referenced after getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.uniqueInstance;

    }
    public void setData(int myData){
        data = myData;
    }

    public int getData(){
        return data;
    }
}