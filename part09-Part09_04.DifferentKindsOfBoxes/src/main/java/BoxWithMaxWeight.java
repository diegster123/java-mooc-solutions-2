/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class BoxWithMaxWeight extends Box{
    Item item;
    int capacity;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() > this.capacity) {
            return;
        }
        BoxWithMaxWeight.this.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
