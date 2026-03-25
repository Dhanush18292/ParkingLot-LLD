package repository;

import model.ParkingLot;
import model.ParkingSpot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLotRepository {

    Map<Integer, ParkingLot> parkingLotMap;

    Map<Integer, List<ParkingSpot>> spotMap;

    public void save (int floorid, ParkingSpot parkingSpots) {

        spotMap.putIfAbsent(floorid, new ArrayList<>());
        spotMap.get(floorid).add(parkingSpots);


    }

    public Map<Integer, List<ParkingSpot>> getAllSpots() {
        return spotMap;
    }
}
