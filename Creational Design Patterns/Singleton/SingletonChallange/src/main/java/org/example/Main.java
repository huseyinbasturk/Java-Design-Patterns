package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");

        Captain c1 = Captain.getCaptain();

        System.out.println("Trying to make another captain for our team");
        Captain c2 = Captain.getCaptain();

        if(c1 == c2){
            System.out.println("c1 and c2 are the same instance");
        }

    }
}