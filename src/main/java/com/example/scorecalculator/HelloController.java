package com.example.scorecalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private Button deleteLast;

    @FXML
    protected void onDeleteButtonClick(ActionEvent event)
    {
        baseScore.setText(str);
    }

    public HelloController()
    {
        str = "this";
    }

}