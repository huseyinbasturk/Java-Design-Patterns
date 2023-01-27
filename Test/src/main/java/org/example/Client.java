package org.example;

public class Client {

    //internal reference to the service used by this client

    private ExampleService service;

    Client(){
        //specify a specific implementation in the constructor instead of using class
        service = new ExampleService();
    }

    //method within this client that uses the services
    public String greet(){
        return "Hello " + service.getName();
    }

}