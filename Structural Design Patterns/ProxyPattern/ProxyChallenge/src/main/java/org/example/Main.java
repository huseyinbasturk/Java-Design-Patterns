package org.example;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("hb.org");
            internet.connectTo("hello.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}