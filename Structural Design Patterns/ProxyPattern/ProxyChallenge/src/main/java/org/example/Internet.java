package org.example;

public interface Internet {
    void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet{

    @Override
    public void connectTo(String serverHost) throws Exception {
        System.out.println("Connecting to " + serverHost);
    }
}
