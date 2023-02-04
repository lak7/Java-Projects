package com.example.hellofx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.BLACK);
        Stage thisStage = new Stage();


        thisStage.setTitle("Yo!");
        Text txt = new Text();
        txt.setText("YOOOOO");
        txt.setX(100);
        txt.setY(100);
        txt.setFont(Font.font("Verdana", 50));
        txt.setFill(Color.DEEPPINK);

        root.getChildren().add(txt);
        thisStage.setResizable(false);
        thisStage.setScene(scene);
        thisStage.show();

    }
}