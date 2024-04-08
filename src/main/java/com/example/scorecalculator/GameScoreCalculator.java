package com.example.scorecalculator;

public class GameScoreCalculator {
    private int baseScore;
    private int collectionScore;
    private int cipherBoardScore;
    private int emergencyTaskScore;
    private int endingScore;
    private int debtPenalty;

    public GameScoreCalculator(int baseScore, int collectionScore, int cipherBoardScore, int emergencyTaskScore, int endingScore, int debtPenalty) {
        this.baseScore = baseScore;
        this.collectionScore = collectionScore * 10;
        this.cipherBoardScore = cipherBoardScore * 5;
        this.emergencyTaskScore = emergencyTaskScore;
        this.endingScore = (endingScore - 100) * 50 * (-1);
        this.debtPenalty = debtPenalty;
    }
}
