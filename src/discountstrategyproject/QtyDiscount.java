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

    private double discountRate = 0.15;
    private int minimumQty = 5;

    public QtyDiscount(double discountRate, int minimumQty) {
        //add validation
        this.discountRate = discountRate;
        this.minimumQty = minimumQty;
    }

    @Override
    public double getDiscountAmount(double price, int qty){
        double discountAmt = 0.00;
        
        if(qty >= minimumQty) {
            discountAmt = price * qty * discountRate;
        }
        
        return discountAmt;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMinimumQty() {
        return minimumQty;
    }

    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }
    
    
}
