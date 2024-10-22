package co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio;

import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.adapter.PasarelaPagos;
import co.edu.uniquindio.parcial2.parcial_2_yamis.patrones_disenio.adapter.SistemaPagoHeredado;

public class AdaptadorPago implements PasarelaPagos {
    private SistemaPagoHeredado sistemaPagoHeredado;

    public AdaptadorPago(SistemaPagoHeredado sistemaPagoHeredado) {
        this.sistemaPagoHeredado = sistemaPagoHeredado;
    }

    @Override
    public void pagar(double monto) {
        sistemaPagoHeredado.procesarPago((int) monto);
    }
}
