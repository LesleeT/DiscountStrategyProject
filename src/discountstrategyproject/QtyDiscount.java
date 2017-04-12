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

    public QtyDiscount() {
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

    public final void setDiscountRate(double discountRate) {
        if(discountRate < 0.01 || discountRate > 0.99){
            throw new IllegalArgumentException("The discount rate must have a value");
        }
        {   
            this.discountRate = discountRate;
        }
    }
    
    public final int getMinimumQty() {
        return minimumQty;
    }

    public final void setMinimumQty(int minimumQty)throws IllegalArgumentException {
        if(minimumQty == 0){
            throw new IllegalArgumentException("The minimumQty must be greater than 0.");
        }
        this.minimumQty = minimumQty;
    }
    
    
}
