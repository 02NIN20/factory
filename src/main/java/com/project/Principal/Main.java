package com.project.Principal;

import javax.swing.SwingUtilities;

import com.project.Entradas.EntradaConsola;
import com.project.Entradas.EntradaFrame;
import com.project.GUIs.FabricaFrame;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import java.security.Principal;
import com.project.Entradas.Entrada;
import com.project.Entradas.EntradaFrame;
import com.project.GUIs.FabricaConsola;
import com.project.GUIs.FabricaFrame;
import com.project.Salidas.*;

public class Main {
    public static void main(String[] lol) {
        while (true) {
            Cliente cliente;
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Sistema de Calculo ------\n");
            System.out.println("    [Seleccione un método de visualización]    \n");
            System.out.println("    1. Consola");
            System.out.println("    2. Frame");
            System.out.println("    3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    cliente = new Cliente(new FabricaConsola() {
                        @Override
                        public Salida crearSalida() {
                            return new SalidaAdapter(new SalidaConsola());
                        }
                    });
                    cliente.menuInicial();
                    break;
                case 2:
                    SwingUtilities.invokeLater(() -> {
                        Cliente clienteFrame = new Cliente(new FabricaFrame() {
                            @Override
                            public Salida crearSalida() {
                                return new SalidaAdapter(new SalidaFrame());
                            }
                        });
                        clienteFrame.menuInicial();
                    });
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
}