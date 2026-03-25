package Stratergy;

import enums.VehicleType;
import model.ParkingSpot;
import model.Vehicle;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignSpot(Vehicle vehicle);
}
