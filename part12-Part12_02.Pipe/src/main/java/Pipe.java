
import java.util.List;
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
public class Pipe<T> {

    private List<T> values;

    public Pipe() {
        this.values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.values.add(value);
    }

    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        }
        T taken = this.values.get(0);
        this.values.remove(0);
        return taken;
    }

    public boolean isInPipe() {
        return (this.values.isEmpty()) ?  false : true;
        
    }
}
