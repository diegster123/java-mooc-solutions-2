/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;    
    
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for (Sensor s : this.sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor s : this.sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : this.sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("Sensor must be on and must not be empty.");
        }
        int sum = 0;
        for (Sensor s : this.sensors) {
            sum += s.read();
        }
        int avg = sum / this.sensors.size();
        this.readings.add(avg);
        return avg;
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }
}
