package com.example.evthandle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle myCircle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        System.out.println(y);
        y -= 5;
        myCircle.setCenterY(y);
    }

    public void down(ActionEvent e){
        System.out.println(y);
        y += 5;
        myCircle.setCenterY(y);
    }

    public void left(ActionEvent e){
        System.out.println(x);
        x -= 5;
        myCircle.setCenterX(x);
    }

    public void right(ActionEvent e){
        System.out.println(x);
        x += 5;
        myCircle.setCenterX(x);
    }
}

