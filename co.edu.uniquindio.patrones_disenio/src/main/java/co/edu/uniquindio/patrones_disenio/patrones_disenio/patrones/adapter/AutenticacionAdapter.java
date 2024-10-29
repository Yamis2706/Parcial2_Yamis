package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaAntiguo;
import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaNuevoMFA;

public class AutenticacionAdapter implements SistemaAntiguo {
    private SistemaNuevoMFA sistemaNuevoMFA;

    public AutenticacionAdapter(SistemaNuevoMFA sistemaNuevoMFA) {
        this.sistemaNuevoMFA = sistemaNuevoMFA;
    }

    @Override
    public void autenticar(String usuario, String contraseña) {
        System.out.println("Adaptando autenticación básica a multifactor...");
        sistemaNuevoMFA.autenticarConOTP("123456");
    }
}