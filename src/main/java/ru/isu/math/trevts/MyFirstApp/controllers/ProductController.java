package ru.isu.math.trevts.MyFirstApp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ProductController {




    @FXML
    void But_Product(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/productView.fxml"));
        stage.setTitle("Добавить клиента");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }

    @FXML
    void But_Add_Product(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/productAdd.fxml"));
        stage.setTitle("Подробнее");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }


}
