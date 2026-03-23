package repository;

import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {

    Map<Integer,Ticket> ticketMap = new HashMap<Integer, Ticket>();
    private int ticketId;

    public Ticket save(Ticket ticket) {
        ticketId++;

        ticket.setId(ticketId);
        ticketMap.put(ticketId, ticket);
        return ticket;


    }


}
