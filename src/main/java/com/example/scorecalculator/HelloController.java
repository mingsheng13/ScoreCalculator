package com.example.scorecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HelloController
{
    private ArrayList<Integer> emergencyScore;

    @FXML
    private TextField baseScore;

    @FXML
    private TextField collectionsScore;

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
        scoreboard.appendText(selected +" = "+ getScore + "\n");
        emergencyScore.add(getScore);
    }

    @FXML
    protected void onDeleteLastClick(ActionEvent event)
    {
        try
        {
            emergencyScore.removeLast();
        }
        catch (NoSuchElementException ignored)
        {

        }
    }

    @FXML
    protected void onSubmitClick(ActionEvent event)
    {
        int finalTotal = 0;
        for (int score : emergencyScore)
        {
            finalTotal += score;
        }
        totalScore.setText(String.valueOf(finalTotal));
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
    }

    public HelloController()
    {
        emergencyScore = new ArrayList<>();
    }
}