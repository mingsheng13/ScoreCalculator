package com.example.scorecalculator;

public class Main {
    public static void main(String[] args) {
        GameScoreCalculator calculator = new GameScoreCalculator(100, 3, 2, 500,0);

        calculator.addEmergencyTask(EmergencyTask.ICE_SHADOW);
        calculator.addEmergencyTask(EmergencyTask.NETWORK);
        calculator.addEmergencyTask(EmergencyTask.ICE_SHADOW);

        int totalScore = calculator.calculateTotalScore();
        System.out.println("Total Score: " + totalScore);
    }
}
