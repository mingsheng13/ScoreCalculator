package com.example.scorecalculator;

public class GameScoreCalculator {

    public void setEmergencyTaskScore(int emergencyTaskScore) { this.emergencyTaskScore = emergencyTaskScore; };

    private int baseScore;
    private int collectionScore;
    private int cipherBoardScore;
    private int emergencyTaskScore;
    private int endingScore;
    private int withdraw;

    public GameScoreCalculator() {}

    public GameScoreCalculator(int baseScore, int collectionScore, int cipherBoardScore, int endingScore, int withdraw) {
        this.baseScore = baseScore;
        this.collectionScore = collectionScore * 10;
        this.cipherBoardScore = cipherBoardScore * 5;
        this.endingScore = endingScore;
        this.withdraw = withdraw;
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

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int calculateTotalScore() {
        if (withdraw > 100){
            return baseScore + collectionScore + cipherBoardScore + endingScore + emergencyTaskScore - (withdraw -100) * 50;
        }
        else{
            return baseScore + collectionScore + cipherBoardScore + endingScore + emergencyTaskScore;
        }
    }

    public void addEmergencyTask(int score)
    {
        emergencyTaskScore += score;
    }
}
