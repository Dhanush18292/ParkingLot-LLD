package repository;

import model.Gate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GateRepository {

    private final Map<Integer, Gate> gateMap = new HashMap<>();

    private int gateId =0;

    public void addGate(Gate gate) {

        gateId++;

        gateMap.put(gateId, gate);
    }

}
