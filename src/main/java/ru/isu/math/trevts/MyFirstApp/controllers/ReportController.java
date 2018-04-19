package ru.isu.math.trevts.MyFirstApp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ReportController {



    @FXML
    void But_Rep_Post(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/reportPost.fxml"));
        stage.setTitle("Добавить клиента");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }

    @FXML
    void But_Rep_Check(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/reportCheck.fxml"));
        stage.setTitle("Подробнее");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


    @FXML
    void But_Rep_Personal(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/reportPers.fxml"));
        stage.setTitle("Изменить");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


}
