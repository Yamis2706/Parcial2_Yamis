package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.command;

public class Invocador {
    public void ejecutar(Command command) {
        command.execute();
    }
}
