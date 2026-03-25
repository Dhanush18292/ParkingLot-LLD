package Stratergy;

import enums.ParkingSpotType;
import enums.VehicleType;
import model.Vehicle;

public class VehicleSpotMapper {

    public ParkingSpotType mapSpot(VehicleType vehicleType){

        switch(vehicleType){

            case Car : return ParkingSpotType.Four_Wheeler;
            case Bike : return ParkingSpotType.Two_Wheeler;
            case Truck : return ParkingSpotType.Large;

            default :
                throw new IllegalArgumentException("Unknown vehicle type");
        }


    }
}
