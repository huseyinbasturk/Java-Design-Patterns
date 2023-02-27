package org.example;

import java.util.HashMap;
import java.util.Hashtable;

public class PlayerFactory {
    private static HashMap<String, Player> hm = new HashMap<String, Player>();

    public static Player getPlayer(String type){
        Player p = null;

        if(hm.containsKey(type)){
            p = hm.get(type);
        } else {
            switch(type){
                case "Terrorist":
                    System.out.println("Terrorist created");
                    p = new Terrorist();
                    break;
                case "Counter Terrorist":
                    System.out.println("Counter terrorist created");
                    p = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unreachable code!");

            }
            hm.put(type,p);

        }

        return p;
    }
}
