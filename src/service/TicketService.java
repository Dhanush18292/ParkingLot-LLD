package service;

import Stratergy.SpotAssignmentStrategy;
import enums.SpotAssignmentStrategyType;
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
import java.util.Optional;

public class TicketService {

    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private TicketRepo ticketRepo;



    private int ticketid;

    public Ticket issueTicket(Vehicle vehicle, Gate gate) {

        vehicleRepository.save(vehicle);

        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(SpotAssignmentStrategyType.RANDOM);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(vehicle.getVehicletype());

        Ticket ticket = new Ticket();

        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);

        ticketRepo.save(ticket);

        return ticket;

    }

}
