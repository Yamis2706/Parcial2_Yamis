package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.command;

public class EntregaNacionalCommand implements Command {
    private Receptor receptor;

    public EntregaNacionalCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaNacional();
    }
}
