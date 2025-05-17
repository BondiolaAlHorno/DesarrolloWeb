package com.tp_16_5;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Controlador controlador = Controlador.altaControlador();

        controlador.venderEntrada();

        System.out.println("Ventas registradas: " + controlador.getVentas());
    }
}
