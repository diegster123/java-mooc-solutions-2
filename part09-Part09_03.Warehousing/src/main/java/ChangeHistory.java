
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
public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        double start = this.list.get(0);
        for (int i = 1; i < this.list.size() - 1; i++) {
            double compare = this.list.get(i);
            if (start < compare) {
                start = compare;
            }
        }
        return start;
    }
    
    public double minValue() {
        if (this.list.isEmpty()) {
            return 0.0;
        }
        double start = this.list.get(0);
        for (int i = 1; i < this.list.size() - 1; i++) {
            double compare = this.list.get(i);
            if (start > compare) {
                start = compare;
            }
        }
        return start;
    }
    
    public double average() {
        double sum = 0;
        for (Double value : this.list) {
            sum += value;
        }
        
        return sum / this.list.size();
    }
}
