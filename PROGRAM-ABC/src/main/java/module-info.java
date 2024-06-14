module com.example.programabc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programabc to javafx.fxml;
    exports com.example.programabc;
}