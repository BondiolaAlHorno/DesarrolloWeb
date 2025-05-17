package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Funcion {
    private Pelicula pelicula;
    private Sala sala;
    private String fecha;
    private String hora;

    public  Funcion(Pelicula pelicula,Sala sala,String fecha,String hora){
        this.pelicula = pelicula;
        this.sala = sala;
        this.fecha = fecha;
        this. hora = hora;
    }

    public static Funcion altaFuncion(Pelicula pelicula,Sala sala,String fecha,String hora){
        return new Funcion(pelicula,sala,fecha,hora);
    }
}
