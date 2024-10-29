package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.impl;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaAntiguo;

public class SistemaAntiguoImpl implements SistemaAntiguo {
    @Override
    public void autenticar(String usuario, String contraseña) {
        System.out.println("Autenticación básica con usuario y contraseña.");
    }
}

