package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new RealInternet();

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
    }


    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverHost);
    }
}
