package com.example.demo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class HomeFrame extends Scene {

    private Label label;
    private NavigateBar navigateBar;



    public HomeFrame() {
        super(new VBox(), 800, 600);

        Label label = new Label("HOME PAGE");

        navigateBar = new NavigateBar();

        VBox layout = (VBox) getRoot();
        layout.setSpacing(20);

        layout.getChildren().addAll(navigateBar);
    }

    public NavigateBar getNavigateBar() {
        return navigateBar;
    }
}

