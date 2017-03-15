/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Leslee
 */
public class PosTerminal {
    private Receipt receipt;
    
    //start sale
    public final void startSale(String custId, DataAccessStrategy db){
        receipt = new Receipt(custId, db);
    }
    
    //add items to sale
    public final void addItemToSale(String prodId, int qty){
        receipt.addLineItem(prodId, qty);
        
    }
    
    //end sale
    
}
