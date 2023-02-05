module com.example.evthandle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.evthandle to javafx.fxml;
    exports com.example.evthandle;
}