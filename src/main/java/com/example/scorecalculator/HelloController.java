package com.example.scorecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HelloController
{


    private ArrayList<Integer> emergencyScore;

    private ArrayList<String> info;

    @FXML
    private TextField baseScore;

    @FXML
    private TextField collectionScore;

    @FXML
    private TextField cipherboardScore;

    @FXML
    private TextField endingScore;

    @FXML
    private TextField deptPenalty;

    @FXML
    private TextArea scoreboard;

    @FXML
    private TextField totalScore;

    @FXML
    private ChoiceBox<String> emergencyTask;

    @FXML
    protected void onEmergencyAdd(ActionEvent event)
    {
        String selected = emergencyTask.getValue();
        int getScore = EmergencyTask.getScore(selected);
        info.add(selected +" = "+ getScore);
        scoreboard.setText(String.join("\n", info));
        emergencyScore.add(getScore);
    }

    @FXML
    protected void onDeleteLastClick(ActionEvent event)
    {
        try
        {
            emergencyScore.removeLast();
            info.removeLast();
            scoreboard.setText(String.join("\n", info));
        }
        catch (NoSuchElementException ignored)
        {

        }
    }

    private int parseScore(String text)
    {
        try
        {
            return Integer.parseInt(text);
        }
        catch (NumberFormatException ex)
        {
            return 0;
        }
    }

    @FXML
    protected void onSubmitClick(ActionEvent event)
    {
        GameScoreCalculator gameScoreCalculator = new GameScoreCalculator();
        gameScoreCalculator.setBaseScore(parseScore(baseScore.getText()));
        gameScoreCalculator.setCollectionScore(parseScore(collectionScore.getText()));
        gameScoreCalculator.setCipherBoardScore(parseScore(cipherboardScore.getText()));
        gameScoreCalculator.setEndingScore(parseScore(endingScore.getText()));
        gameScoreCalculator.setWithdraw(parseScore(deptPenalty.getText()));
        gameScoreCalculator.addEmergencyTask(emergencyScore);
        scoreboard.appendText("\n=====结算=====\n");
        scoreboard.appendText(gameScoreCalculator.toString());
        int total = gameScoreCalculator.calculateTotalScore();
        totalScore.setText(String.valueOf(total));
    }

    @FXML
    protected void onResetClick(ActionEvent event)
    {
        baseScore.clear();
        collectionScore.clear();
        cipherboardScore.clear();
        endingScore.clear();
        deptPenalty.clear();
        emergencyScore = new ArrayList<>();
        info = new ArrayList<>();
        scoreboard.clear();
        totalScore.clear();
    }


    @FXML
    public void initialize()
    {
        emergencyTask.getItems().addAll(
                EmergencyTask.NETWORK.getName(),
                EmergencyTask.CONTAMINATED_SHELL.getName(),
                EmergencyTask.NO_LEAK.getName(),
                EmergencyTask.COMPANY_CONFLICT.getName(),
                EmergencyTask.ICE_SHADOW.getName()
        );
        emergencyTask.setValue(EmergencyTask.NETWORK.getName());
    }

    public HelloController()
    {
        emergencyScore = new ArrayList<>();
        info = new ArrayList<>();
    }
}