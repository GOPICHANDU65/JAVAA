module com.example.javaa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaa to javafx.fxml;
    exports com.example.javaa;
}