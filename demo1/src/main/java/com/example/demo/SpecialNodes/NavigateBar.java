package com.example.demo.SpecialNodes;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class NavigateBar extends VBox {

    private Label label;
    private Button homeButton;
    private Button profileButton;
    private Button tuneButton;
    private Button settingsButton;
    private ImageView homeImageView;
    private ImageView profileImageView;
    private ImageView tuneImageView;
    private ImageView settingsImageView;

    public NavigateBar() {
        super(20);


        // Set Navigate Bar VBox (Color, size)
        this.setStyle("-fx-border-color: #605b5b; -fx-border-width: 2px; -fx-border-radius: 5px");
        this.setMaxWidth(200);
        this.setPrefHeight(1000);

        // Images
        Image homeImage = new Image(getClass().getResourceAsStream("/com/example/demo/home_ico.png"));
        homeImageView = new ImageView(homeImage);
        homeImageView.setPreserveRatio(true);
        homeImageView.setFitWidth(20);

        Image profileImage = new Image(getClass().getResourceAsStream("/com/example/demo/profile_ico.png"));
        profileImageView = new ImageView(profileImage);
        profileImageView.setPreserveRatio(true);
        profileImageView.setFitWidth(20);

        Image tuneImage = new Image(getClass().getResourceAsStream("/com/example/demo/tune_ico.png"));
        tuneImageView = new ImageView(tuneImage);
        tuneImageView.setPreserveRatio(true);
        tuneImageView.setFitWidth(20);

        Image settingsImage = new Image(getClass().getResourceAsStream("/com/example/demo/settings_ico.png"));
        settingsImageView = new ImageView(settingsImage);
        settingsImageView.setPreserveRatio(true);
        settingsImageView.setFitWidth(20);

        // Buttons
        homeButton = new Button("Home", homeImageView);
        profileButton = new Button("Profile", profileImageView);
        tuneButton = new Button("Tune", tuneImageView);
        settingsButton = new Button("Settings", settingsImageView);

        homeButton.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));
        profileButton.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));
        tuneButton.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));
        settingsButton.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));

        homeButton.setPrefWidth(200);
        profileButton.setPrefWidth(200);
        tuneButton.setPrefWidth(200);
        settingsButton.setPrefWidth(200);

        homeButton.setStyle("-fx-background-color: transparent;");
        profileButton.setStyle("-fx-background-color: transparent;");
        tuneButton.setStyle("-fx-background-color: transparent;");
        settingsButton.setStyle("-fx-background-color: transparent;");

        // Label
        label = new Label("Tune");
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        label.setMaxWidth(Double.MAX_VALUE);
        label.setAlignment(Pos.CENTER);

        // Adding label and buttons to VBox
        this.getChildren().addAll(label, homeButton, profileButton, tuneButton, settingsButton);

        addHoverEffect(homeButton);
        addHoverEffect(profileButton);
        addHoverEffect(tuneButton);
        addHoverEffect(settingsButton);

    }

    private void addHoverEffect(Button button) {
        button.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button.setStyle("-fx-background-color: #e1dddd;");
            }
        });

        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                button.setStyle("-fx-background-color: transparent; -fx-text-fill: black;"); // Original style
            }
        });
    }

    // Getters for Buttons
    public Button getHomeButton() {
        return homeButton;
    }
    public Button getProfileButton() {
        return profileButton;
    }
    public Button getTuneButton() {
        return tuneButton;
    }
    public Button getSettingsButton() {
        return settingsButton;
    }

}

