package org.example;

public interface Service {
    void write(String message);
}

class ServiceA implements Service{

    @Override
    public void write(String message) {
        System.out.println("Hello World");
    }
}

class Client {
    private Service myService;

    //inject via the constructor
    public Client(Service service){
        this.myService = service;
    }

    public void doSomething(){
        myService.write("This is a message");
    }

    public void setService(Service service){
        this.myService = service;
    }

    public static void main(String[] args){
        Service service = new ServiceA(); //injector
        Client client = new Client(service); //injects via the constructor
        client.doSomething();

        client.setService(service); //setter injection
    }
}