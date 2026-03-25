package Stratergy;

import enums.VehicleType;
import factory.SpotAssignmentStrategyFactory;
import model.ParkingLot;
import model.ParkingSpot;
import model.Vehicle;
import repository.ParkingLotRepository;

import java.util.List;
import java.util.Map;

public class RandomParkingSpotStrategy implements SpotAssignmentStrategy {
   private ParkingLotRepository parkingLotRepository;

    @Override
    public ParkingSpot assignSpot(Vehicle vehicle) {

        Map<Integer, List<ParkingSpot>> spotMap = parkingLotRepository.getAllSpots();


        for (Map.Entry<Integer, List<ParkingSpot>> entry : spotMap.entrySet()) {
            int spotId = entry.getKey();
            List<ParkingSpot> spotList = entry.getValue();

            for (ParkingSpot parkingSpot : spotList) {

                if (parkingSpot.getParkingSpotType().equals(vehicle.getVehicleType())) {
                    parkingSpot.setVehicle(vehicle);
                }

                return parkingSpot;
            }

        }
        return null;
    }
}
