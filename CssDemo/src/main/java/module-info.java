module com.example.cssdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cssdemo to javafx.fxml;
    exports com.example.cssdemo;
}