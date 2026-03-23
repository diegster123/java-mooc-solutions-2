/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private double initialBalance;
    private ChangeHistory history;  
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.initialBalance = initialBalance;
    }
    
    public String history() {
        return super.toString();
    }
}
