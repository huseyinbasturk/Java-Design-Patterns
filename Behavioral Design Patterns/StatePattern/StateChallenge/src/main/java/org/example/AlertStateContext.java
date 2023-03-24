package org.example;

public class AlertStateContext {
    private MobileAlertState state;

    public AlertStateContext() {
        this.state = new Vibration();
    }

    public void setState(MobileAlertState state) {
        this.state = state;
    }

    public void alert(){
        state.alert();
    }

}


