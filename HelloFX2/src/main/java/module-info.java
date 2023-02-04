module com.example.hellofx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellofx2 to javafx.fxml;
    exports com.example.hellofx2;
}