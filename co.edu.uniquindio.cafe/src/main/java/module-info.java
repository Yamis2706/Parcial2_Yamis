module co.edu.uniquindio.cafe.calcular {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.cafe.calcular to javafx.fxml;
    exports co.edu.uniquindio.cafe.calcular;
}