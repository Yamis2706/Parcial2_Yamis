module co.edu.uniquindio.parcial2.parcial_2_yamis {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial2.parcial_2_yamis to javafx.fxml;
    exports co.edu.uniquindio.parcial2.parcial_2_yamis;
}