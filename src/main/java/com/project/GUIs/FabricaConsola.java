package com.project.GUIs;
import com.project.Entradas.*;
import com.project.Salidas.*;
import com.project.Logica.*;
import com.project.Principal.FabricaGUI;


public class FabricaConsola implements FabricaGUI{


     @Override
    public Entrada crearEntrada() {
        return new EntradaConsola();
    }

    @Override
    public Salida crearSalida() {
        return new SalidaConsola();
    }

    @Override
    public Logica crearLogica() {
        return new LogicaConsola();
    }    
}