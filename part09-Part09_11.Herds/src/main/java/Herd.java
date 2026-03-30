
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Herd implements Movable{
    private List<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        String toPrint = "";
        for (Movable item : this.list) {
            toPrint += item + "\n"; 
        }
        return toPrint;
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < this.list.size(); i++) {
            Movable movable = this.list.get(i);
            movable.move(dx, dy);
        }
    }
    
}
