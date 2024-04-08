module com.example.scorecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scorecalculator to javafx.fxml;
    exports com.example.scorecalculator;
}