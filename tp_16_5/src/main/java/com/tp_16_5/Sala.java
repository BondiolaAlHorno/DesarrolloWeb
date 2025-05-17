package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Sala {
    private String nombre;
    private List<Asiento> asientos;
    private String tecnologia;

    public Sala(String nombre,List<Asiento> asientos,String tecnologia){
        this.nombre = nombre;
        this.asientos = asientos;
        this.tecnologia = tecnologia;
    }

    public static Sala altaSala(String nombre,List<Asiento> asientos,String tecnologia){
        return new Sala(nombre,asientos,tecnologia);
    }

    public List<Asiento> mostrarAsientosDisponibles(){
        List<Asiento> disponibles = new ArrayList<>();
        for(Asiento asiento : this.asientos){
            if(asiento.getDisponibilidad()){
                disponibles.add(asiento);
            }
        }
        return  disponibles;
    }
}
