package com.project.GUIs;

import com.project.Principal.FabricaGUI;
import javax.swing.*;
import java.awt.*;
import com.project.Entradas.*;
import com.project.Salidas.*;
import com.project.Logica.*;

public class FabricaFrame extends JFrame implements FabricaGUI {

    public FabricaFrame() {
        JFrame framePrincipal = new JFrame("Aplicación Principal");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(300, 300);
        framePrincipal.setLocationRelativeTo(null);

        EntradaFrame entrada = (EntradaFrame) crearEntrada();
        SalidaFrame salida = (SalidaFrame) crearSalida();


        framePrincipal.add(entrada, BorderLayout.NORTH);
        framePrincipal.add(salida, BorderLayout.CENTER);


        Logica logica = crearLogica(entrada, salida);

       framePrincipal.setVisible(true);
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaFrame();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaFrame();
    }

    @Override
    public Logica crearLogica() {
        return new LogicaFrame((EntradaFrame) crearEntrada(), (SalidaFrame) crearSalida());
    }
    
    public Logica crearLogica(EntradaFrame entradaFrame, SalidaFrame salidaFrame) {
        return new LogicaFrame(entradaFrame, salidaFrame);
    }
}
