
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ShoppingCart {
    Map<String, Integer> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.cart.put(product, price);
    }
    
    public int price() {
        int total = 0;
        for (int price : this.cart.values()) {
            total += price;
        }
        return total;
    }
}
