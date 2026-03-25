package service;

import Stratergy.SpotAssignmentStrategy;
import enums.SpotAssignmentStrategyType;
import enums.TicketStatus;
import enums.VehicleType;
import factory.SpotAssignmentStrategyFactory;
import model.Gate;
import model.ParkingSpot;
import model.Ticket;
import model.Vehicle;
import repository.GateRepository;
import repository.TicketRepo;
import repository.VehicleRepository;

import java.lang.reflect.Parameter;
import java.time.LocalDateTime;
import java.util.Optional;

public class TicketService {

    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private TicketRepo ticketRepo;

    public TicketService(VehicleRepository vehicleRepository, GateRepository gateRepository, TicketRepo ticketRepo, int ticketCounter) {
        this.vehicleRepository = vehicleRepository;
        this.gateRepository = gateRepository;
        this.ticketRepo = ticketRepo;
        this.ticketCounter = ticketCounter;
    }

    private int ticketCounter= 0;

    public Ticket issueTicket(Vehicle vehicle, Gate gate) {

        vehicleRepository.save(vehicle);

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(SpotAssignmentStrategyType.RANDOM);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicle);


        if (parkingSpot != null) {
            parkingSpot.setOccupied(true);
        } else{
            throw new RuntimeException("Parking Spot not found");
        }


        ticketCounter++;

        Ticket ticket = new Ticket(
                ticketCounter,
                TicketStatus.OPEN,
                vehicle,
                parkingSpot,
                LocalDateTime.now(),
                gate
        );

        ticketRepo.save(ticket);



        return ticket;


    }

}
