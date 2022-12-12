module com.example.custom_controls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.custom_controls to javafx.fxml;
    exports com.example.custom_controls;
}