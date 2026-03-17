
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
public class IOU {
    private HashMap<String, Double> map;
    
    public IOU() {
        this.map = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.map.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.map.getOrDefault(toWhom, 0.0);
    }
}
