package model;

import java.util.List;

public class ParkingFloor {

    private int id;
    private List<ParkingSpot> parkingSpot;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ParkingSpot> getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(List<ParkingSpot> parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
