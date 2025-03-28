package com.project.GUIs;

import com.project.Principal.FabricaGUI;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import com.project.Entradas.*;
import com.project.Salidas.*;

public class FabricaFrame extends JFrame implements FabricaGUI {
    private JFrame framePrincipal;

    public FabricaFrame() {
        framePrincipal = new JFrame("Aplicación Principal");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(300, 200);
        framePrincipal.setLocationRelativeTo(null);

        double entradas = crearEntrada();
        configurarEventos();
        crearSalida();
    }

    private void configurarEventos() {
        crearEntrada().setActionListener((ActionEvent e) -> {
            procesarEntrada();
        });
    }

    private void procesarEntrada() {
        double numero = entrada.entradaNumero();
        crearSalida().mostrarNumero(numero);
    }

    @Override
    public Entrada crearEntrada() {
        EntradaFrame entrada = new EntradaFrame();
        framePrincipal.add(entrada, BorderLayout.NORTH);
        return entrada;
    }

    @Override
    public Salida crearSalida() {
        SalidaFrame salida = new SalidaFrame();
        framePrincipal.add(salida, BorderLayout.CENTER);
        return salida;
    }

    public void mostrarGUI() {
        framePrincipal.setVisible(true);
    }
}