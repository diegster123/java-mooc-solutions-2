/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Container {
    private int initialValue;
    private int threshold;
    
    public Container() {
        this.initialValue = 0;
        this.threshold = 100;
    }
    
    public int contains() {
        return this.initialValue;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.initialValue += amount;
            if (this.initialValue > this.threshold) {
                this.initialValue = this.threshold;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (amount > this.initialValue) {
                amount = this.initialValue;
            }
            this.initialValue -= amount;
        }
    }
    
    public String toString() {
        return this.initialValue + "/" + this.threshold;
    }
}
