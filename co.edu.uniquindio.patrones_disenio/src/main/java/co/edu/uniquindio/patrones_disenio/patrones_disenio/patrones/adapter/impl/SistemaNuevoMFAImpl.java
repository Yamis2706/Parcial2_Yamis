package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.impl;

import co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in.SistemaNuevoMFA;

public class SistemaNuevoMFAImpl implements SistemaNuevoMFA {
    @Override
    public void autenticarConOTP(String otp) {
        System.out.println("Autenticando con OTP: " + otp);
    }

    @Override
    public void autenticarConBiometria(String datosBiometricos) {
        System.out.println("Autenticando con datos biométricos.");
    }

    @Override
    public void autenticarConDispositivo(String idDispositivo) {
        System.out.println("Autenticando con el dispositivo: " + idDispositivo);
    }
}
