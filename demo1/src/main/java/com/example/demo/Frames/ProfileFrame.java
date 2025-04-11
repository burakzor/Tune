package com.example.demo.Frames;

import com.example.demo.SpecialNodes.NavigateBar;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class ProfileFrame extends Scene {

    private NavigateBar navigateBar;

    public ProfileFrame() {
        super(new VBox() , 800 , 600);

        navigateBar = new NavigateBar();

        VBox layout = (VBox) getRoot();
        layout.getChildren().add(navigateBar);
    }

    public NavigateBar getNavigateBar() {
        return navigateBar;
    }
}
