package org.example;

import java.util.LinkedList;

public interface IteratorInterface {
    void first(); //reset to first element
    String next(); //get next element
    boolean isDone(); //end of collection check
    String getCurrentItem(); //retrieve current item

}

class ArtsIterator implements IteratorInterface{

    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String getCurrentItem() {
        return subjects[position];
    }
}

class ScienceIterator implements IteratorInterface{

    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator(LinkedList<String> subjects) {
        this.subjects = subjects;
        this.position = 0;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public String next() {
        return subjects.get(position++);
    }

    @Override
    public boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String getCurrentItem() {
        return subjects.get(position);
    }
}
