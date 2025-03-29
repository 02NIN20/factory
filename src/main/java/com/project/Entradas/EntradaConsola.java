package com.project.Entradas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaConsola implements Entrada{

    @Override
    public double entradaNumero() {
        try {
            System.out.println("Ingrese un número: ");
            return new Scanner(System.in).nextDouble();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un número válido.");
            return 0.0;
        }
    }
}
