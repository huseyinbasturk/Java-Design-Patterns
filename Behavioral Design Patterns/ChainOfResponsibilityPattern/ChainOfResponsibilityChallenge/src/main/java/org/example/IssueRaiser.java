package org.example;

public class IssueRaiser {
    public ReceiverInterface firstReceiver;

    public IssueRaiser(ReceiverInterface firstReceiver){
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message msg){
        if(firstReceiver != null){
            firstReceiver.processMessage(msg);
        }
    }
}
