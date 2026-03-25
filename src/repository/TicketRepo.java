package repository;

import model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {

    Map<Integer,Ticket> ticketMap = new HashMap<Integer, Ticket>();
    public Ticket save(Ticket ticket) {

        ticketMap.put(ticket.getTicketId(), ticket);
        return ticket;


    }


}
