package com.project.GUIs;

import com.project.Principal.FabricaGUI;
import javax.swing.*;
import java.awt.*;
import com.project.Entradas.*;
import com.project.Salidas.*;
import com.project.Logica.*;

public class FabricaFrame extends JFrame implements FabricaGUI {

    public FabricaFrame() {
        //this.entrada = new EntradaFrame().a();
        //this.salida = new SalidaFrame();
        JFrame framePrincipal = new JFrame("Aplicación Principal");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(300, 300);
        framePrincipal.setLocationRelativeTo(null);
        //framePrincipal.add(entrada, BorderLayout.NORTH);
        //framePrincipal.add(salida, BorderLayout.CENTER);
        EntradaFrame entrada = (EntradaFrame) crearEntrada();
        SalidaFrame salida = (SalidaFrame) crearSalida();

        // Agregar los componentes al frame
        framePrincipal.add(entrada, BorderLayout.NORTH);
        framePrincipal.add(salida, BorderLayout.CENTER);

        // Crear la lógica y configurar eventos
        Logica logica = crearLogica(entrada, salida);

        /*
        // Crear y agregar los componentes
        EntradaFrame entradaFrame = (EntradaFrame) crearEntrada();
        SalidaFrame salidaFrame = (SalidaFrame) crearSalida();
        

        // Crear lógica (aunque no se agrega al frame)
        crearLogica(entradaFrame, salidaFrame);*/

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