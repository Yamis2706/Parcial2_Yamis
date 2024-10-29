package co.edu.uniquindio.patrones_disenio.patrones_disenio.patrones.adapter.in;


public interface SistemaNuevoMFA {
    void autenticarConOTP(String otp);
    void autenticarConBiometria(String datosBiometricos);
    void autenticarConDispositivo(String idDispositivo);
}

