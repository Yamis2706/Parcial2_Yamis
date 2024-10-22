module co.edu.uniquindio.parcial2.parcial_2_yamis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports co.edu.uniquindio.parcial2.parcial_2_yamis.viewController;
    opens co.edu.uniquindio.parcial2.parcial_2_yamis.viewController;

    exports co.edu.uniquindio.parcial2.parcial_2_yamis.controller;
    opens co.edu.uniquindio.parcial2.parcial_2_yamis.controller;

    exports co.edu.uniquindio.parcial2.parcial_2_yamis.factory;
    opens co.edu.uniquindio.parcial2.parcial_2_yamis.factory;

    exports co.edu.uniquindio.parcial2.parcial_2_yamis.model;
    opens co.edu.uniquindio.parcial2.parcial_2_yamis.model;

    opens co.edu.uniquindio.parcial2.parcial_2_yamis to javafx.fxml;
    exports co.edu.uniquindio.parcial2.parcial_2_yamis;
}