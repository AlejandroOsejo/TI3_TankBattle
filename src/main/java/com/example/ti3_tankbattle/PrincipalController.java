package com.example.ti3_tankbattle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PrincipalController {
    @FXML
    private TextField p2TextField;

    @FXML
    private TextField cpuTextField;

    @FXML
    private TextField p1TextField;

    @FXML
    void Start(ActionEvent event) {
        Application.showWindow("game.fxml");
        Stage currentStage = (Stage) p1TextField.getScene().getWindow();
        currentStage.hide();
    }

    @FXML
    void Close(ActionEvent event) {

    }
}