package com.project.Logica;

import java.awt.event.ActionEvent;
import com.project.Entradas.*;    
import com.project.Salidas.*; 

public class LogicaFrame implements Logica {
    private EntradaFrame entrada;
    private SalidaFrame salida;

    public LogicaFrame(EntradaFrame entrada, SalidaFrame salida) {
        this.entrada = entrada;
        this.salida = salida;
        //configurarEventos();

        if (entrada instanceof EntradaFrame && salida instanceof SalidaFrame) {
            EntradaFrame entradaFrame = (EntradaFrame) entrada;
            SalidaFrame salidaFrame = (SalidaFrame) salida;

            entradaFrame.getBotonProcesar().addActionListener(e -> {
                double numero = entrada.entradaNumero();
                double resultado = procesarNumero(numero);
                salida.mostrarNumero(resultado);
            });
        }
    }
/*
    private void configurarEventos() {
        entrada.getBotonProcesar().addActionListener((ActionEvent e) -> {
            procesarNumero(entrada.entradaNumero());
        });

        
    }*/

    @Override
    public double procesarNumero(double n) {
            if (n < 0) {
                salida.mostrarMensaje("El número debe ser positivo.");
                return 0;
            }
            double resultado = Math.sqrt(n);
            salida.mostrarNumero(resultado); // Mostrar el resultado
            return resultado;
    }
}
