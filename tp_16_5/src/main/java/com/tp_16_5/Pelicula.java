package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Pelicula {
    private String titulo;
    private String duracion;

    public Pelicula(String titulo,String duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public static Pelicula altaPelicula(String titulo,String duracion){
        return new Pelicula(titulo,duracion);
    }
}
