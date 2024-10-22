package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.command;

public class EntregaLocalCommand implements Command {
    private Receptor receptor;

    public EntregaLocalCommand(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void execute() {
        receptor.realizarEntregaLocal();
    }
}
