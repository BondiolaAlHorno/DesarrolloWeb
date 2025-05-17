package com.tp_16_5;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Ticket {
    private Funcion funcion;
    private Asiento asiento;

    public Ticket(Funcion funcion,Asiento asiento){
        this.funcion = funcion;
        this.asiento = asiento;
    }

    public static Ticket altaTicket(Funcion funcion,Asiento asiento){
        return new Ticket(funcion,asiento);
    }
}
