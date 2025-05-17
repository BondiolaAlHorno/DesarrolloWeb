package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Asiento {
    private Integer numero;
    private Boolean disponibilidad;

    public Asiento(Integer numero,Boolean disponibilidad){
        this.numero = numero;
        this.disponibilidad = disponibilidad;
    }

    public static Asiento altaAsiento(Integer numero,Boolean disponibilidad){
        return new Asiento(numero,disponibilidad);
    }
}
