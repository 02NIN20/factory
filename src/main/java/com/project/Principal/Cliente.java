package com.project.Principal;
import java.util.Scanner;

import javax.swing.SwingUtilities;

import java.security.Principal;

import com.project.Entradas.Entrada;
import com.project.Entradas.EntradaFrame;
import com.project.GUIs.FabricaFrame;
import com.project.Salidas.Salida;

public class Cliente {
    private FabricaGUI fabrica;
    private Entrada entrada;
    private Salida salida;

    Cliente() {

    
    }


    public void menuInicial() {
            while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Sistema de Calculo ------\n");
            System.out.println("    [Selecciones un metodo de visualizacion]    \n");
            System.out.println("    1. Consola");
            System.out.println("    2. Frame");
            System.out.println("    3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:                                
                        
                    break;
                case 2:
                        new FabricaFrame().mostrarGUI();
                    break;
                case 3:
                    System.out.println("Muchas gracias. ¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
    }
    /* 
    public void Prueba() {
        Entrada entrada = fabricar.crearEntrada();
        Principal principal = fabricar.crearPrincipal();
        Bebida bebida = fabricar.crearBebida();
        Postre postre = fabricar.crearPostre();

        entrada.servirEntrada();
        principal.servirPrincipal();
        bebida.servirBebida();
        postre.servirPostre();
    }*/



}
