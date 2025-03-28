package com.project.Entradas;

import javax.swing.*;
import java.awt.event.ActionListener;

public class EntradaFrame extends JPanel implements Entrada {
    private JTextField campoEntrada;
    private JButton botonProcesar;

    public EntradaFrame() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel etiqueta = new JLabel("Ingrese un número:");
        etiqueta.setAlignmentX(CENTER_ALIGNMENT);
        add(etiqueta);

        campoEntrada = new JTextField(10);
        campoEntrada.setMaximumSize(campoEntrada.getPreferredSize());
        add(campoEntrada);

        botonProcesar = new JButton("Calcular");
        botonProcesar.setAlignmentX(CENTER_ALIGNMENT);
        add(botonProcesar);
    }

    @Override
    public double entradaNumero() {
        try {
            return Double.parseDouble(campoEntrada.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return 0.0;
        }
    }

    public void setActionListener(ActionListener listener) {
        botonProcesar.addActionListener(listener);
    }
}