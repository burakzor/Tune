module com.example.tunefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tunefx to javafx.fxml;
    exports com.example.tunefx;
}