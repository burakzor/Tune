module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.Controller;
    opens com.example.demo.Controller to javafx.fxml;
    exports com.example.demo.SpecialNodes;
    opens com.example.demo.SpecialNodes to javafx.fxml;
    exports com.example.demo.Frames;
    opens com.example.demo.Frames to javafx.fxml;
}