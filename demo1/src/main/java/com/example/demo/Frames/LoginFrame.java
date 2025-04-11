package com.example.demo.Frames;

import com.example.demo.SpecialNodes.GeneralButton;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LoginFrame extends Scene {

    private Button loginButton;
    private TextField usernameTextField;
    private PasswordField passwordField;
    private Label tuneLabel;
    private Label loginLabel;
    private Label usernameLabel;
    private Label passwordLabel;
    private ImageView backgroundImageView;

    public LoginFrame() {
        super(new StackPane(), 800, 600);
        this.getStylesheets().add(getClass().getResource("welcomeFrameStyle.css").toExternalForm());

        // Label for the text
        tuneLabel = new Label("Tune");
        loginLabel = new Label("Log In");
        usernameLabel = new Label("Username");
        passwordLabel = new Label("Password");

        usernameLabel.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 17));
        passwordLabel.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 17));

        // Buttons
        loginButton = new GeneralButton("Login");

        // Text fields for username and password
        usernameTextField = new TextField();
        passwordField = new PasswordField();

        usernameTextField.setPromptText("Username");
        passwordField.setPromptText("Password");

        usernameTextField.setStyle("-fx-background-color: transparent; -fx-border-color: #8e8989; -fx-border-width: 1px; -fx-border-radius: 5px;");
        passwordField.setStyle("-fx-background-color: transparent; -fx-border-color: #8e8989; -fx-border-width: 1px; -fx-border-radius: 5px;");
        usernameTextField.setMaxWidth(360);
        passwordField.setMaxWidth(360);

        // Image for background
        Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/demo/TuneBackground.png"));
        backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(800);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);

        StackPane layout = (StackPane) getRoot();

        // VBox
        VBox usernameVBox = new VBox(10);
        VBox passwordVBox = new VBox(10);
        VBox allElementsVBox = new VBox(20);

        allElementsVBox.setMaxWidth(400);
        allElementsVBox.setMaxHeight(200);

        allElementsVBox.setStyle("-fx-border-color: #9f9b9b; -fx-border-width: 2px; -fx-border-radius: 8px;");

        usernameVBox.getChildren().addAll(usernameLabel, usernameTextField);
        passwordVBox.getChildren().addAll(passwordLabel, passwordField);
        allElementsVBox.getChildren().addAll(usernameVBox, passwordVBox, loginButton);

        usernameVBox.setAlignment(Pos.CENTER_LEFT);
        passwordVBox.setAlignment(Pos.CENTER_LEFT);
        allElementsVBox.setAlignment(Pos.CENTER);

        usernameVBox.setPadding(new Insets(0,0,0,20));
        passwordVBox.setPadding(new Insets(0,0,0,20));

        layout.getChildren().addAll(backgroundImageView, allElementsVBox);

    }

    // Getters for Buttons
    public Button getLoginButton() {
        return loginButton;
    }
}
