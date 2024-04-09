package com.example.scorecalculator;

public class GameScoreCalculator {

    public void setEmergencyTaskScore(int emergencyTaskScore) { this.emergencyTaskScore = emergencyTaskScore; };

    private int baseScore;
    private int collectionScore;
    private int cipherBoardScore;
    private int emergencyTaskScore;
    private int endingScore;
    private int debtPenalty;

    public GameScoreCalculator() {}

    public GameScoreCalculator(int baseScore, int collectionScore, int cipherBoardScore, int endingScore, int debtPenalty) {
        this.baseScore = baseScore;
        this.collectionScore = collectionScore * 10;
        this.cipherBoardScore = cipherBoardScore * 5;
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

    public int calculateTotalScore() {
        return baseScore + collectionScore + cipherBoardScore + endingScore + emergencyTaskScore - debtPenalty;
    }

    public void addEmergencyTask(int score)
    {
        emergencyTaskScore += score;
    }
}
