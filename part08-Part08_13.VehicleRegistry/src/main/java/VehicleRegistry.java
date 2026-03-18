
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> map;

    public VehicleRegistry() {
        this.map = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.map.containsKey(licensePlate)) {
            return false;
        }

        this.map.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return this.map.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.map.containsKey(licensePlate)) {
            this.map.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : this.map.keySet()) {
            System.out.println(plates);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        for (String owner : this.map.values()) {
            if (!printed.contains(owner)) {
                printed.add(owner);
                System.out.println(owner);
            }
        }
    }
}
