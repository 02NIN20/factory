package com.project.Logica;
import com.project.Entradas.Entrada;
import com.project.Entradas.EntradaConsola;
import com.project.Salidas.Salida;

public class LogicaConsola implements Logica{

    @Override
    public double procesarNumero(double n){
        try {
            double numero = n;
            if (numero < 0) {
                System.out.println("El número debe ser positivo.");
            }
            double resultado = Math.sqrt(numero);
            return resultado;
        } catch (NumberFormatException ex) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
        }
        return -1;
    }
}