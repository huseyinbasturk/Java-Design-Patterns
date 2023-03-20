package org.example;

public class Main {
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        CricketDate cricketDate = new CricketDate();

        cricketDate.registerObserver(averageScoreDisplay);
        cricketDate.registerObserver(currentScoreDisplay);

        cricketDate.dataChanged();

        cricketDate.unregisterObserver(averageScoreDisplay);

        cricketDate.dataChanged();
    }
}