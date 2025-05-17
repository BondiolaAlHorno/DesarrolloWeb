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
public class Venta {
    private List<Ticket> tickets;

    public Venta(List<Ticket> tickets){
        this.tickets = tickets;
    }

    public static Venta altaVenta(List<Ticket> tickets){
        return new Venta(tickets);
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
