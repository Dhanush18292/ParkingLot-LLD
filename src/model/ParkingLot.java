package model;

import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;

    public ParkingLot(List<ParkingFloor> parkingFloors, List<Gate> gates) {
        this.parkingFloors = parkingFloors;
        this.gates = gates;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
