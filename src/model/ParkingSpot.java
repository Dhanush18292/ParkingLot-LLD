package model;

import enums.ParkingSpotType;

public class ParkingSpot {

    private int id;
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private boolean isOccupied;

    public ParkingSpot(int id, ParkingSpotType parkingSpotType, Vehicle vehicle, boolean isOccupied) {
        this.id = id;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = vehicle;
        this.isOccupied = isOccupied;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
