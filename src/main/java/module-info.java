module com.example.rpg_simulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rpg_simulator to javafx.fxml;
    exports com.example.rpg_simulator;
}