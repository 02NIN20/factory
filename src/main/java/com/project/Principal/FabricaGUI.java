package com.project.Principal;

import com.project.Entradas.Entrada;
import com.project.Salidas.Salida;

public interface FabricaGUI {
    Salida crearSalida();
    Entrada crearEntrada();
}
