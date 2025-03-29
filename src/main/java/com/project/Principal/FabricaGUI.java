package com.project.Principal;

import com.project.Entradas.*;
import com.project.Salidas.*;
import com.project.Logica.*;

public interface FabricaGUI {
    Entrada crearEntrada();
    Logica crearLogica();
    Salida crearSalida();    
}
