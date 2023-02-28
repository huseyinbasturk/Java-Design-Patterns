package org.example;

public interface ReceiverInterface {
    boolean processMessage(Message msg);
    void setNextChain(ReceiverInterface nextChain);
}

class FaxErrorHandler implements ReceiverInterface{
    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Fax")){
            System.out.println("FaxErrorHandler processes " + msg.priority + " priority, issue: " + msg.text);
            return true;
        } else if(nextReceiver != null){
            nextReceiver.processMessage(msg);
        }
        return false;
    }

    public void setNextChain(ReceiverInterface nextReceiver){
        this.nextReceiver = nextReceiver;
    }
}

class EmailErrorHandler implements ReceiverInterface{
    private ReceiverInterface nextReceiver;

    @Override
    public boolean processMessage(Message msg) {
        if(msg.text.contains("Email")){
            System.out.println("EmailErrorHandler processes " + msg.priority + " priority, issue: " + msg.text);
            return true;
        } else if(nextReceiver != null){
            nextReceiver.processMessage(msg);
        }
        return false;
    }

    @Override
    public void setNextChain(ReceiverInterface nextReceiver) {
        this.nextReceiver = nextReceiver;
    }
}
