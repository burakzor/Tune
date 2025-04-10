package com.example.demo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class WelcomeFrame extends Scene {

    private Button login;
    private Button signUp;
    private ImageView backgroundImageView;



    public WelcomeFrame() {
        super(new StackPane(), 800, 600);

        // Labels
        Label tuneLabel = new Label("TUNE");
        tuneLabel.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        Label descriptionLabel = new Label("Start listening and\n discovering music");
        descriptionLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 20));

        //Buttons
        login = new Button("Login");
        signUp = new Button("Sign Up");

        login.setStyle("-fx-background-color: gray;");
        signUp.setStyle("-fx-background-color: black; -fx-text-fill: white;");

        login.setPrefWidth(110);
        signUp.setPrefWidth(110);

        // Images ( Background & Messi )
        Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/demo/TuneBackground.png"));

        backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);


        VBox vbox = new VBox(20);
        HBox hbox = new HBox(20);
        hbox.getChildren().addAll(login, signUp);
        vbox.getChildren().addAll(tuneLabel, descriptionLabel, hbox);

        vbox.setAlignment(Pos.CENTER);
        hbox.setAlignment(Pos.CENTER);

        StackPane layout = (StackPane) getRoot();
        layout.getChildren().addAll(backgroundImageView, vbox);
    }

    // getters for Buttons
    public Button getLogin() {
        return login;
    }

    public Button getSignUp() {
        return signUp;
    }
}
