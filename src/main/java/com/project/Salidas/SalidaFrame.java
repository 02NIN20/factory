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
        revalidate(); // Asegura que el componente se actualice
        repaint();    // Redibuja el componente
    }

    public void mostrarMensaje(String mensaje) {
        etiquetaResultado.setText(mensaje);
        revalidate(); // Asegura que el componente se actualice
        repaint();    // Redibuja el componente
    }
    
    /*
    private JLabel etiquetaResultado;
    public SalidaFrame() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        etiquetaResultado = new JLabel("Resultado aparecerá aquí");
        etiquetaResultado.setForeground(new Color(0, 0, 200));
        add(etiquetaResultado);
    }

    
    
    @Override
    public void mostrarNumero(double resultado) {
        etiquetaResultado.setText("Resultado: " + resultado);
        etiquetaResultado.setForeground(Color.BLUE);
    }

    public void mostrarError(String mensaje) {
        etiquetaResultado.setText(mensaje);
        etiquetaResultado.setForeground(Color.RED);
    }
    */
}
