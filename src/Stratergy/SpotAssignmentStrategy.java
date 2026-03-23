package Stratergy;

import enums.VehicleType;
import model.ParkingSpot;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignSpot(VehicleType vehicleType);
}
