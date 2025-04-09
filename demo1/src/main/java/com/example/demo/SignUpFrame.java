package com.example.demo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SignUpFrame extends Scene {

    private Button welcome;
    private Button signUp;
    private TextField username;
    private PasswordField password;

    public SignUpFrame() {
        super(new VBox(), 800, 600);

        Label label = new Label("SignUp");
        welcome = new Button("Go to Welcome Page");
        signUp = new Button("SignUp");
        username = new TextField();
        password = new PasswordField();

        VBox layout = (VBox) getRoot();
        layout.setSpacing(20);
        layout.getChildren().addAll(label, welcome,username, password, signUp);
    }

    public Button getWelcome() {
        return welcome;
    }

    public Button getSignUp() {
        return signUp;
    }
}
