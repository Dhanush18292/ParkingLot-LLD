package model;

import enums.GateType;

import java.time.LocalDateTime;

public class Gate {

    private int id;
    private String Name;
    private GateType gateType;


    public Gate(int id, String name, GateType gateType) {
        this.id = id;
        Name = name;
        this.gateType = gateType;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
