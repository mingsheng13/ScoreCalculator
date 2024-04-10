package com.example.scorecalculator;

import java.util.ArrayList;

public class GameScoreCalculator {

    public void setEmergencyTaskScore(int emergencyTaskScore) { this.emergencyTaskScore = emergencyTaskScore; };

    private int baseScore;
    private int collectionScore;
    private int cipherBoardScore;
    private int emergencyTaskScore;
    private int endingScore;
    private int withdraw;

    public GameScoreCalculator()
    {
        baseScore = 0;
        collectionScore = 0;
        cipherBoardScore = 0;
        emergencyTaskScore = 0;
        endingScore = 0;
        withdraw = 0;
    }

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
        this.collectionScore = collectionScore * 10;
    }

    public void setCipherBoardScore(int cipherBoardScore) {
        this.cipherBoardScore = cipherBoardScore * 5;
    }

    public void setEndingScore(int endingScore) {
        this.endingScore = endingScore;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int calculateTotalScore() {
        int total = baseScore + collectionScore + cipherBoardScore + endingScore + emergencyTaskScore;
        if (withdraw > 100){
            return total - (withdraw - 100) * 50;
        }
        else{
            return total - withdraw;
        }
    }

    public void addEmergencyTask(int score)
    {
        emergencyTaskScore += score;
    }

    public void addEmergencyTask(ArrayList<Integer> score)
    {
        if (score.isEmpty())
        {
            emergencyTaskScore = 0;
            return;
        }
//        for (int i = 0; i <= score.size(); i++){
//            emergencyTaskScore += score.get(i);
        for (int i : score)
        {
                emergencyTaskScore += i;
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("结算分数 = ").append(baseScore).append("\n")
                .append("收藏品分数 = ").append(collectionScore).append("\n")
                .append("密文板分数 = ").append(cipherBoardScore).append("\n")
                .append("结局分数 = ").append(endingScore).append("\n")
                .append("负债扣分 = ").append(withdraw).append("\n")
                .append("紧急/特殊作战加分 = ").append(emergencyTaskScore).append("\n");
        return sb.toString();
    }
}
