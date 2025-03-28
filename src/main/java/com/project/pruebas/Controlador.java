package com.project.pruebas;

import com.project.Entradas.Entrada;
import com.project.Salidas.Salida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private final Entrada entrada;
    private final Salida salida;

    public Controlador(Entrada entrada, Salida salida) {
        this.entrada = entrada;
        this.salida = salida;
        
        configurarEventos();
    }

    private void configurarEventos() {
        entrada.setActionListener((ActionEvent e) -> {
            procesarEntrada();
        });
    }

    private void procesarEntrada() {
        double numero = entrada.entradaNumero();
        salida.mostrarNumero(numero);
    }
}