package model;

import enums.VehicleType;

public class Vehicle {

    private String vehicleId;
    private VehicleType vehicleType;

    public Vehicle(String vehicleId, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }


    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
