package org.example;

public class Captain {

    private Captain(){}

    //Bill Pugh solution

    private static class SingletonHelper {
        //nested class is referenced after getCaptain() is called
        private static final Captain captain = new Captain();
    }

    public static Captain getCaptain(){
        return SingletonHelper.captain;
    }
}
