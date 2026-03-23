package repository;

import model.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<Integer, Vehicle> vehiclesmap =  new HashMap<>();
    private int vehicleId;



    public Vehicle save (Vehicle vehicle){

        vehicleId++;

        vehiclesmap.put(vehicleId, vehicle);

        return vehicle;

    }


}
