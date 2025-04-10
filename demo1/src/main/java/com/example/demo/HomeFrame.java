package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class HomeFrame extends Scene {

    private Label label;
    private ImageView messiImageView;


    public HomeFrame() {
        super(new VBox(), 800, 600);

        Label label = new Label("HOME PAGE");

        Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/demo/messi.jpeg"));
        messiImageView = new ImageView(backgroundImage);
        messiImageView.setFitWidth(800);
        messiImageView.setFitHeight(600);
        messiImageView.setPreserveRatio(false);


        VBox layout = (VBox) getRoot();
        layout.setSpacing(20);
        layout.getChildren().addAll(messiImageView, label);
    }

}

