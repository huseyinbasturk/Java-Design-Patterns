package org.example;

public interface Player {
    //extrinsic data
    void assignWeapon(String weapon);

    void mission();
}
class Terrorist implements Player{
    //intrinsic attribute
    private final String TASK;
    private String weapon;

    public Terrorist(){
        TASK = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + ": Task is " + TASK);
    }
}


class CounterTerrorist implements Player{
    private final String TASK;

    private String weapon;

    public CounterTerrorist(){
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter terrorist with weapon " + weapon + ": TASK is" + TASK);

    }
}
