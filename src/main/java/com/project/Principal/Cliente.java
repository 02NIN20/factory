package com.project.Principal;

import com.project.Entradas.*;
import com.project.GUIs.*;
import com.project.Salidas.*;
import com.project.Logica.*;

public class Cliente {
    private FabricaGUI fabrica;
    private Entrada entrada;
    private Logica logica;
    private Salida salida;

    public Cliente(FabricaGUI fab) {
        this.fabrica = fab;
    }

    public FabricaGUI getFab() {
        return fabrica;
    }

    public void setFab(FabricaGUI fab) {
        this.fabrica = fab;
    }

    public void menuInicial() { 
            entrada = fabrica.crearEntrada();
            salida = fabrica.crearSalida();
            logica = fabrica.crearLogica();
    
            double numeroEntrada = entrada.entradaNumero();
            double resultado = logica.procesarNumero(numeroEntrada);
            salida.mostrarNumero(resultado);
    }
}
