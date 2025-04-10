package com.example.demo;
//yakup
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class Controller {

    // Stage and Frames
    private Stage stage;
    private WelcomeFrame welcomeFrame;
    private LoginFrame loginFrame;
    private SignUpFrame signUpFrame;
    private HomeFrame homeFrame;

    public Controller(Stage stage) {
        this.stage = stage;
    }

    public void initScenes() {
        welcomeFrame = new WelcomeFrame();
        loginFrame = new LoginFrame();
        signUpFrame = new SignUpFrame();
        homeFrame = new HomeFrame();

        // Adding actions to the Buttons
        welcomeFrame.getLogin().setOnAction(new goToLoginFrame());
        welcomeFrame.getSignUp().setOnAction(new goToSignupFrame());

        loginFrame.getWelcome().setOnAction(new goToWelcomeFrame());
        loginFrame.getLogin().setOnAction(new goToHomeFrame());

        signUpFrame.getWelcome().setOnAction(new goToWelcomeFrame());
        signUpFrame.getSignUp().setOnAction(new goToLoginFrame());
    }

    // Action event methods
    public void showWelcomeFrame() {
        stage.setScene(welcomeFrame);
        stage.setTitle("TUNE");
        stage.show();
    }

    public void showLoginFrame() {
        stage.setScene(loginFrame);
        stage.setTitle("LOGIN");
        stage.show();
    }

    public void showSignupFrame() {
        stage.setScene(signUpFrame);
        stage.setTitle("SIGNUP");
        stage.show();
    }
    public void showHomeFrame() {
        stage.setScene(homeFrame);
        stage.setTitle("HOME");
        stage.show();
    }

    // Inner Classes for Events

    private class goToWelcomeFrame implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showWelcomeFrame();
        }
    }

    private class goToLoginFrame implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showLoginFrame();
        }
    }

    private class goToSignupFrame implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showSignupFrame();
        }
    }

    private class goToHomeFrame implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            showHomeFrame();
        }
    }
}
