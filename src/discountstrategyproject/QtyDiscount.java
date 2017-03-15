/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author ltrinastic
 */
public class QtyDiscount implements DiscountStrategy{

    private double discount = 0.15;
    private double price;
    private int minimumQty;

    public QtyDiscount(double price, int minimumQty) {
        //add validation
        this.price = price;
        this.minimumQty = minimumQty;
    }

    @Override
    public double getDiscountAmount(double discountRate){
        return minimumQty * price * discount;
    }
    
    
}
