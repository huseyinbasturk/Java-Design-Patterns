package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObserver();

}

class CricketDate implements Subject{
    int runs;
    int wickets;
    float overs;

    ArrayList<Observer> observerList;

    public CricketDate() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Iterator<Observer> it = observerList.iterator(); it.hasNext();){
            Observer o = it.next();
            o.update(runs,wickets,overs);
        }
    }

    private int getLatestRuns(){
        return 90;
    }

    private int getLatestWickets(){
        return 2;
    }

    private float getLatestOvers(){
        return (float)10.2;
    }
    public void dataChanged(){
        runs= getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObserver();

    }
}
