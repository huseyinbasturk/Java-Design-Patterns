package org.example;
abstract class RemoteControl {
   public abstract void pressSwitch(TV context);
}

class On extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already on, Going to be off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{

    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already off, Going to be on now");
        context.setState(new On());
    }
}
