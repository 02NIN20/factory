package com.project.Principal;

import com.project.Entradas.Entrada;
import com.project.Salidas.Salida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private final Entrada entrada;
    private final Salida salida;

    

    private void configurarEventos() {
        entrada.setActionListener((ActionEvent e) -> {
            procesarEntrada();
        });
    }

    private void procesarEntrada() {
        double numero = entrada.entradaNumero();
        if(numero != 0.0) {
            // Lógica de procesamiento (ejemplo: duplicar valor)
            double resultado = numero * 2;
            salida.mostrarNumero(resultado);
        }
    }
}