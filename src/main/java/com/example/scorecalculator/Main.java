package com.example.scorecalculator;

public class Main {
    public static void main(String[] args) {
        GameScoreCalculator calculator = new GameScoreCalculator(100, 3, 2, 500,0);

        calculator.addEmergencyTask(EmergencyTask.ICE_SHADOW.getScore());
        calculator.addEmergencyTask(EmergencyTask.NETWORK.getScore());
        calculator.addEmergencyTask(EmergencyTask.ICE_SHADOW.getScore());

        int totalScore = calculator.calculateTotalScore();
        System.out.println("Total Score: " + totalScore);
    }
}
