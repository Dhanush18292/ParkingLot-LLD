package model;

import enums.VehicleType;

public class Vehicle {
    private String id;
    private String name;
    private VehicleType vehicletype;

    public Vehicle(String id, String name, VehicleType vehicletype) {
        this.id = id;
        this.name = name;
        this.vehicletype = vehicletype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleType getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(VehicleType vehicletype) {
        this.vehicletype = vehicletype;
    }
}
