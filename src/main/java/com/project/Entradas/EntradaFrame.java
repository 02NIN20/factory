package com.project.Entradas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EntradaFrame extends JPanel implements Entrada {
    private JTextField campoNumero;
    private JButton botonProcesar;
    private ActionListener procesarListener;

    public EntradaFrame() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel etiqueta = new JLabel("Ingrese un número:");
        campoNumero = new JTextField(15);
        botonProcesar = new JButton("Procesar");

        add(etiqueta);
        add(campoNumero);
        add(botonProcesar);
    }

    @Override
    public double entradaNumero() {
        try {
            return Double.parseDouble(campoNumero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"-----------------------------------");
            return 0;
        }    
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public JButton getBotonProcesar() {
        return botonProcesar;
    }
    
    public void setProcesarListener(ActionListener listener) {
        this.procesarListener = listener;
    }
}