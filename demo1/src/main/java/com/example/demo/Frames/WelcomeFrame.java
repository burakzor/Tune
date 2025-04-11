package com.example.demo.Frames;

import com.example.demo.SpecialNodes.GeneralButton;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class WelcomeFrame extends Scene {

    private Button loginButton;
    private Button signUpButton;
    private ImageView backgroundImageView;



    public WelcomeFrame() {
        super(new StackPane(), 800, 600);
        this.getStylesheets().add(getClass().getResource("welcomeFrameStyle.css").toExternalForm());


        // Labels
        Label tuneLabel = new Label("TUNE");
        tuneLabel.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        Label descriptionLabel = new Label("Start listening and\n discovering music");
        descriptionLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 20));

        //Buttons
        loginButton = new GeneralButton("Login");
        signUpButton = new GeneralButton("Sign Up");

        //loginButton.setStyle("-fx-background-color: LIGHTGRAY;");
        loginButton.getStyleClass().add("grayButton");

        // Images ( Background & Messi )
        Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/demo/TuneBackground.png"));

        backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);

        BorderPane pane = new BorderPane();
        VBox vbox = new VBox(20);
        HBox hbox = new HBox(20);
        hbox.getChildren().addAll(loginButton, signUpButton);
        vbox.getChildren().addAll(tuneLabel, descriptionLabel, hbox);

        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);

        StackPane layout = (StackPane) getRoot();
        layout.getChildren().addAll(backgroundImageView, vbox);
    }

    // getters for Buttons
    public Button getLoginButton() {
        return loginButton;
    }

    public Button getSignUpButton() {
        return signUpButton;
    }
}
