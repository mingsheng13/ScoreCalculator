package com.example.scorecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
    private String str;

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
    private ChoiceBox<String> emergencyTask;

    @FXML
    protected void onDeleteButtonClick(ActionEvent event)
    {
        baseScore.setText(str);
    }

    @FXML
    private void initialize()
    {
        endingScore.setText(str);
//        emergencyTask.getItems().addAll(
//                EmergencyTask.NETWORK.getName(),
//                EmergencyTask.CONTAMINATED_SHELL.getName(),
//                EmergencyTask.NO_LEAK.getName(),
//                EmergencyTask.COMPANY_CONFLICT.getName(),
//                EmergencyTask.ICE_SHADOW.getName()
//        );
    }

    public HelloController()
    {
        str = "this";
    }

}