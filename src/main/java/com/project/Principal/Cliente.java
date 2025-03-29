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
        /*
            double entrada = fabrica.crearEntrada().entradaNumero();
            double logica = fabrica.crearLogica().procesarNumero(entrada);
            fabrica.crearSalida().mostrarNumero(logica);*/
            // Crear las instancias de entrada, salida y lógica usando la fábrica
            entrada = fabrica.crearEntrada();
            salida = fabrica.crearSalida();
            logica = fabrica.crearLogica();
    
            double numeroEntrada = entrada.entradaNumero();
            // Procesar el número usando la lógica
            double resultado = logica.procesarNumero(numeroEntrada);
    
            // Mostrar el resultado en la salida
            salida.mostrarNumero(resultado);
    }
}
