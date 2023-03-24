package org.example;

public interface MobileAlertState {
    void alert();
}
class Vibration implements MobileAlertState{

    @Override
    public void alert() {
        System.out.println("vibration.......");
    }
}

class Silent implements MobileAlertState{

    @Override
    public void alert() {
        System.out.println("silent.......");
    }
}
