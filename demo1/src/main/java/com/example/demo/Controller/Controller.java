package com.example.demo.Controller;

//a
//b
import com.example.demo.Frames.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller {

    // Stage and Frames
    private Stage stage;
    private WelcomeFrame welcomeFrame;
    private LoginFrame loginFrame;
    private SignUpFrame signUpFrame;
    private HomeFrame homeFrame;
    private ProfileFrame profileFrame;
    private TuneFrame tuneFrame;

    public Controller(Stage stage) {
        this.stage = stage;
    }

    public void initScenes() {
        welcomeFrame = new WelcomeFrame();
        loginFrame = new LoginFrame();
        signUpFrame = new SignUpFrame();
        homeFrame = new HomeFrame();
        profileFrame = new ProfileFrame();
        tuneFrame = new TuneFrame();

        // Adding actions to the Buttons
        welcomeFrame.getLoginButton().setOnAction(new goToLoginFrame());
        welcomeFrame.getSignUpButton().setOnAction(new goToSignupFrame());

        loginFrame.getLoginButton().setOnAction(new goToHomeFrame());

        signUpFrame.getSignupButton().setOnAction(new goToLoginFrame());

        homeFrame.getNavigateBar().getProfileButton().setOnAction(new goToProfileFrame());
        homeFrame.getNavigateBar().getHomeButton().setOnAction(new goToHomeFrame());
        homeFrame.getNavigateBar().getTuneButton().setOnAction(new goToTuneFrame());

        profileFrame.getNavigateBar().getProfileButton().setOnAction(new goToProfileFrame());
        profileFrame.getNavigateBar().getHomeButton().setOnAction(new goToHomeFrame());
        profileFrame.getNavigateBar().getTuneButton().setOnAction(new goToTuneFrame());

        tuneFrame.getNavigateBar().getProfileButton().setOnAction(new goToProfileFrame());
        tuneFrame.getNavigateBar().getHomeButton().setOnAction(new goToHomeFrame());
        tuneFrame.getNavigateBar().getTuneButton().setOnAction(new goToTuneFrame());

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
    public void showTuneFrame() {
        stage.setScene(tuneFrame);
        stage.setTitle("TUNE");
        stage.show();
    }
    public void showProfileFrame() {
        stage.setScene(profileFrame);
        stage.setTitle("PROFILE");
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

    private class goToProfileFrame implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            showProfileFrame();
        }
    }

    private class goToTuneFrame implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            showTuneFrame();
        }
    }

}
