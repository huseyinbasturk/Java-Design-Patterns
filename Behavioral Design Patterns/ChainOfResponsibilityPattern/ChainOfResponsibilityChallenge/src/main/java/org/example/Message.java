package org.example;

enum MessagePriority{
    Normal,
    High
}
public class Message {
    public String text;
    public MessagePriority priority;

    public Message(String msg, MessagePriority p){
        this.text = msg;
        this.priority = p;
    }
}
