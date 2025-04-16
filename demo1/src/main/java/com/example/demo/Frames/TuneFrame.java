package com.example.demo.Frames;

import com.example.demo.SpecialNodes.NavigateBar;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class TuneFrame extends Scene {

    NavigateBar navigateBar;
    ImageView backgroundImageView;

    public TuneFrame() {
        super(new StackPane() , 800,600);
        navigateBar = new NavigateBar();

        Image backgroundImage = new Image(getClass().getResourceAsStream("/com/example/demo/Tune_Background.png"));
        backgroundImageView = new ImageView(backgroundImage);
        backgroundImageView.setFitWidth(600);
        backgroundImageView.setFitHeight(600);
        backgroundImageView.setPreserveRatio(false);

        tuneButton a = new tuneButton("Instant Tune", 350, 150);
        tuneButton b = new tuneButton("Tune with a\n    Friend", 590, 160);
        tuneButton c = new tuneButton("Detailed Tune",420,350);



        Pane pane = new Pane();
        pane.getChildren().addAll(a, b, c);

        StackPane layout = (StackPane) getRoot();


        layout.getChildren().addAll(backgroundImageView, navigateBar, pane);
        StackPane.setAlignment(navigateBar, Pos.TOP_LEFT);
        StackPane.setAlignment(backgroundImageView, Pos.TOP_RIGHT);
        StackPane.setAlignment(pane, Pos.CENTER);
        
    }

    public NavigateBar getNavigateBar() {
        return navigateBar;
    }


    public class tuneButton extends Button {


        public tuneButton(String text, int x, int y) {
            super(text);
            this.setShape(new Circle(1000));
            this.setMinSize(100, 100);
            this.setMaxSize(100, 100);
            this.setPrefSize(100, 100);
            this.setLayoutX(x);
            this.setLayoutY(y);
            this.setStyle("-fx-background-color: transparent; -fx-border-color: black; -fx-border-width: 2;");
        }

    }
}
