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
public class Cine {
    private List<Sala> salas;
    private String horarioApertura;
    private String horarioCierre;

    public Cine(List<Sala> salas,String horarioApertura,String horarioCierre){
        this.salas = salas;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public static Cine altaCine(List<Sala> salas,String horarioApertura,String horarioCierre){
        return new Cine(salas,horarioApertura,horarioCierre);
    }
}
