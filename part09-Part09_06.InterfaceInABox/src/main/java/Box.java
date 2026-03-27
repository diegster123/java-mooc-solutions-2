
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= this.capacity) {
            this.list.add(packable);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.list) {
            weight += item.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, " + "total weight " + this.weight() + " kg";
    }
    
}
