
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility() {
        this.map = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.map.putIfAbsent(unit, new ArrayList<>());
        this.map.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (!this.map.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        
        return this.map.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        this.map.get(storageUnit).remove(item);
        if (this.map.get(storageUnit).isEmpty()) {
            this.map.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnit = new ArrayList<>();
        for (String key : this.map.keySet()) {
            storageUnit.add(key);
        }
        return storageUnit;
    }
    
}
