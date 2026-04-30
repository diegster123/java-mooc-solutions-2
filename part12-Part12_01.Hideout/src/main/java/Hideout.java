


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Hideout<T> {

    private T hideout;

    public Hideout() {
        this.hideout = null;
    }

    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }
    
    public T takeFromHideout() {
        if (this.hideout == null) {
            return null;
        } 
        T hideoutState = null;
        hideoutState = this.hideout;
        this.hideout = null;
        return hideoutState;
    }
    
    public boolean isInHideout() {
        if (this.hideout == null) {
            return false;
        }
        return true;
    }
}
