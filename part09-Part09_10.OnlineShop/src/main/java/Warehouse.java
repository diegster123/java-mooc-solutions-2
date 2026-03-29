
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Warehouse {

    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (!this.price.containsKey(product)) {
            return -99;
        }
        return this.price.get(product);
    }

    public int stock(String product) {
        if (!this.stock.containsKey(product)) {
            return 0;
        }
        return this.stock.get(product);
    }

    public boolean take(String product) {
        if (!this.stock.containsKey(product)) {
            return false;
        }
        int stock = this.stock.get(product);
        if (stock > 0) {
            stock = stock - 1;
            this.stock.put(product, stock);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<>();
        for (String product : this.price.keySet()) {
            products.add(product);
        }
        return products;
    }
}
