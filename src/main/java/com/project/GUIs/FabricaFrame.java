package com.project.GUIs;

import com.project.Principal.FabricaGUI;
import javax.swing.*;
import java.awt.*;
import com.project.Entradas.*;
import com.project.Salidas.*;
import com.project.Logica.*;

public class FabricaFrame extends JFrame implements FabricaGUI {
    private EntradaFrame entrada;
    private SalidaFrame salida;

    public FabricaFrame() {
        JFrame framePrincipal = new JFrame("Aplicación Principal");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(300, 300);
        framePrincipal.setLocationRelativeTo(null);

        entrada = new EntradaFrame();
        salida = new SalidaFrame();

        framePrincipal.add(entrada, BorderLayout.NORTH);
        framePrincipal.add(salida, BorderLayout.CENTER);

        framePrincipal.setVisible(true);
    }

    @Override
    public Entrada crearEntrada() {
        return entrada;
    }

    @Override
    public Salida crearSalida() {
        return new SalidaAdapter(salida);
    }

    @Override
    public Logica crearLogica() {
        return new LogicaFrame(entrada, salida);
    }
}