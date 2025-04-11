package com.example.demo.SpecialNodes;

import javafx.animation.*;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;


public class GeneralButton extends Button {

    private ScaleTransition scaleUp;
    private ScaleTransition scaleDown;
    private FadeTransition fadeUp;
    private FadeTransition fadeDown;


    public GeneralButton(String buttonText) {
        super(buttonText);
        this.setOpacity(.9);

        createHoverEffects();
        setHoverEffects();
    }

    private void createHoverEffects() {

        fadeUp = new FadeTransition(Duration.millis(300), this);
        fadeUp.setToValue(1.0);

        fadeDown = new FadeTransition(Duration.millis(300), this);
        fadeDown.setToValue(.9);

        scaleUp = new ScaleTransition(Duration.seconds(0.1), this);
        scaleUp.setToX(1.03);
        scaleUp.setToY(1.03);


        scaleDown = new ScaleTransition(Duration.seconds(0.1), this);
        scaleDown.setToX(1.0);
        scaleDown.setToY(1.0);
    }

    private void setHoverEffects() {
        this.setOnMouseEntered(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                fadeUp.play();
                scaleUp.playFromStart();
            }
        });

        this.setOnMouseExited(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                fadeDown.play();
                scaleDown.playFromStart();
            }
        });
    }


}
