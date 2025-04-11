package com.example.demo;

import com.example.demo.Controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;

public class Start extends Application {
    @Override
    public void start(Stage stage) {
        Controller controller = new Controller(stage);
        controller.initScenes();
        controller.showWelcomeFrame();
    }

    public static void main(String[] args) {
        launch();
    }
}
