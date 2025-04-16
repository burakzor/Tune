package com.example.demo.SpecialNodes;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
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
import javafx.util.Duration;

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
        homeButton = new NavBarButton("Home", homeImageView);
        profileButton = new NavBarButton("Profile", profileImageView);
        tuneButton = new NavBarButton("Tune", tuneImageView);
        settingsButton = new NavBarButton("Settings", settingsImageView);


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

                button.setStyle("-fx-background-color: #dadada;");
            }
        });

        button.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                button.setStyle(String.format("-fx-background-color: transparent;"));
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


    class NavBarButton extends Button {

        private final int BUTTON_WIDTH = 200;
        private final int BUTTON_HEIGHT = 100;

        private FadeTransition fadeUp;
        private FadeTransition fadeDown;

        public NavBarButton(String name, ImageView imgView) {
            super(name, imgView);
            this.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 10));
            this.setPrefWidth(BUTTON_WIDTH);
            this.setPrefHeight(BUTTON_HEIGHT);
            setHoverEffects();
        }

        private void createHoverEffects() {

            fadeUp = new FadeTransition(Duration.millis(300), this);
            fadeUp.setToValue(6.0);

            fadeDown = new FadeTransition(Duration.millis(300), this);
            fadeDown.setToValue(1);
        }

        private void setHoverEffects() {
            this.setOnMouseEntered(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    fadeUp.play();
                }
            });

            this.setOnMouseExited(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    fadeDown.play();
                }
            });
        }




    }

}

