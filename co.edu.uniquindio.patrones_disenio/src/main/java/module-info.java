module co.edu.uniquindio.patrones_disenio.patrones_disenio {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.patrones_disenio.patrones_disenio to javafx.fxml;
    exports co.edu.uniquindio.patrones_disenio.patrones_disenio;
}