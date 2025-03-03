package main;

import java.util.ArrayList;

public class Factory {
    private String name;
    private ArrayList<Machine> machines = new ArrayList<>();

    public Factory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }
}
