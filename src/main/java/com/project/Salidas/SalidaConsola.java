package com.project.Salidas;

public class SalidaConsola implements Salida{
    

    @Override
    public void mostrarNumero(double numero) {
        System.out.println("El resultado es: " + numero);
    }
}
