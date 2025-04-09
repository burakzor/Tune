package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class HomeFrame extends Scene {

    private Label label;


    public HomeFrame() {
        super(new VBox(), 1000, 700);

        Label label = new Label("HOME PAGE");


        VBox layout = (VBox) getRoot();
        layout.setSpacing(20);
        layout.getChildren().addAll(label);
    }

}

