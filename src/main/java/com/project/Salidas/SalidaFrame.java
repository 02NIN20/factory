package com.project.Salidas;

import javax.swing.*;
import java.awt.*;

public class SalidaFrame extends JPanel implements Salida {
    private JLabel etiquetaResultado;

    public SalidaFrame() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        etiquetaResultado = new JLabel("Resultado: ");
        add(etiquetaResultado);
    }

    @Override
    public void mostrarNumero(double numero) {
        etiquetaResultado.setText("Resultado: " + numero);
        revalidate();
        repaint();
    }

    public void mostrarMensaje(String mensaje) {
        etiquetaResultado.setText(mensaje);
        revalidate();
        repaint(); 
    }
}
