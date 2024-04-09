package com.example.scorecalculator;
import java.util.HashMap;
import java.util.Map;

public class GameScoreCalculator {

    private int baseScore;
    private int collectionScore;
    private int cipherBoardScore;
    private Map<EmergencyTask, Integer> emergencyTaskScore;
    private int endingScore;
    private int debtPenalty;


    public GameScoreCalculator(int baseScore, int collectionScore, int cipherBoardScore, int endingScore, int debtPenalty) {
        this.baseScore = baseScore;
        this.collectionScore = collectionScore * 10;
        this.cipherBoardScore = cipherBoardScore * 5;
        this.emergencyTaskScore = new HashMap<>();
        this.endingScore = (endingScore - 100) * 50;
        this.debtPenalty = debtPenalty;
    }

    public void setBaseScore(int baseScore) {
        this.baseScore = baseScore;
    }

    public void setCollectionScore(int collectionScore) {
        this.collectionScore = collectionScore;
    }

    public void setCipherBoardScore(int cipherBoardScore) {
        this.cipherBoardScore = cipherBoardScore;
    }

    public void setEndingScore(int endingScore) {
        this.endingScore = endingScore;
    }

    public void setDebtPenalty(int debtPenalty) {
        this.debtPenalty = debtPenalty;
    }

    public void addEmergencyTask(EmergencyTask task) {
        emergencyTaskScore.put(task, emergencyTaskScore.getOrDefault(task, 0) + task.getScore());
    }

    public int calculateTotalScore() {
        int totalEmergencyScore = emergencyTaskScore.values().stream().mapToInt(Integer::intValue).sum();
        return totalEmergencyScore + baseScore + collectionScore + cipherBoardScore + endingScore - debtPenalty;
    }
}
