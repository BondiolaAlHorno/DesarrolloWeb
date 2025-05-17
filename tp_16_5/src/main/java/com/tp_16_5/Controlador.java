package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Controlador {
    private Cine cine;
    private List<Funcion> funciones;
    private List<Venta> ventas;

    public Controlador(){
        this.cine = necesitoUnCine();
        this.funciones = necesitoUnaFuncion();
        this.ventas = new ArrayList<>();
    }

    public static Controlador altaControlador(){
        return new Controlador();
    }

    public Cine necesitoUnCine(){
        List<Asiento> asientos = new ArrayList<>();
        for(int i = 1; i<5; i++){
            asientos.add(Asiento.altaAsiento(i,true));
        }
        List<Sala> salas = new ArrayList<>(List.of(Sala.altaSala("sala1",asientos,"2d")));
        Cine cine = Cine.altaCine(salas,"9:00","12:00");
        return cine;
    }

    public List<Funcion> necesitoUnaFuncion(){
        Pelicula pelicula = Pelicula.altaPelicula("Titanic","3:15");
        List<Funcion> funciones = new ArrayList<>(List.of(Funcion.altaFuncion(pelicula,this.cine.getSalas().get(0),"18/5","17:00")));
        return funciones;
    }

    public void venderEntrada() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Venta venta = Venta.altaVenta(new ArrayList<>());
        List<Funcion> listaFunciones = getFunciones();
        System.out.println(listaFunciones);
        System.out.println("seleccione una funcion");
        String input = reader.readLine();
        if (!"".equals(input)) {
            Funcion funcion = listaFunciones.get(Integer.parseInt(input));
            while (true) {
                List<Asiento> asientosDisponibles = funcion.getSala().mostrarAsientosDisponibles();
                System.out.println(asientosDisponibles.size());
                System.out.println(asientosDisponibles);
                System.out.println("seleccione un asiento");
                input = reader.readLine();
                if (!"".equals(input)) {
                    Asiento asiento = asientosDisponibles.get(Integer.parseInt(input));
                    asiento.setDisponibilidad(false);
                    venta.addTicket(Ticket.altaTicket(funcion, asiento));
                } else {
                    break;
                }
            }
            if(!venta.getTickets().isEmpty()){
                getVentas().add(venta);
            }
        }
        else {
            System.out.println("finalizado");
        }
    }
}
