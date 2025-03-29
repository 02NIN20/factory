package com.project.Salidas;

public class SalidaAdapter implements Salida {
    private final Salida salida;

    public SalidaAdapter(Salida salida) {
        this.salida = salida;
    }

    @Override
    public void mostrarNumero(double numero) {
        // Convierte el double a int antes de mostrarlo
        int numeroEntero = (int) Math.round(numero);
        salida.mostrarNumero(numeroEntero);
    }
}