package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginFrame extends Scene {

    private Button welcome;
    private Button login;
    private TextField username;
    private PasswordField password;

    public LoginFrame() {
        super(new VBox(), 800, 600);

        // Label for the text
        Label label = new Label("Login");

        // Buttons
        welcome = new Button("Go to Welcome Page");
        login = new Button("Login");

        // Text fields for username and password
        username = new TextField();
        password = new PasswordField();

        VBox layout = (VBox) getRoot();
        layout.setSpacing(20);
        layout.getChildren().addAll(label, welcome, username, password, login);
    }

    // Getters for Buttons
    public Button getWelcome() {
        return welcome;
    }

    public Button getLogin() {
        return login;
    }
}
