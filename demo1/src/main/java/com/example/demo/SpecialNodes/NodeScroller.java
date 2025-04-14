package com.example.demo.SpecialNodes;

import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

import java.util.ArrayList;

public class NodeScroller extends ScrollPane {

    public NodeScroller(ArrayList<Node> nodes) {

        this.setPrefWidth(500);
        this.setPrefHeight(130);
        this.setMaxHeight(130);
        this.setMaxWidth(500);

        HBox layout = new HBox();
        layout.setSpacing(10);
        layout.getChildren().addAll(nodes);

        this.setContent(layout);

        this.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        this.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);


    }
}
