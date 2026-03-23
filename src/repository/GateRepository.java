package repository;

import model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    private final Map<Integer, Gate> gateMap = new HashMap<>();
    public Gate getGate(int id) {
        return gateMap.get(id);
    }

    private int gateId;

    public void setId(int id) {}

    public void addGate(Gate gate) {

        gateId++;

        gateMap.put(gateId, gate);
    }

}
