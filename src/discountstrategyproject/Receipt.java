/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Leslee
 */
public class Receipt implements OutputStrategy {
    DataAccessStrategy db;
    Customer customer;
    private LineItem[] lineItems;
    
    public Receipt(String custId, DataAccessStrategy db) {
        
    }
    
    private final Customer findCustomer(String custId, DataAccessStrategy db){
        return db.findCustId(custId,db);
    }

    public final void addLineItem(String prodId, int qty) {
       LineItem item = new LineItem(prodId, qty, db);
       addToArray(item);
       
    }
    
     private void addToArray(final LineItem item) {
        // needs validation
        if(item == null){
            throw new IllegalArgumentException("Error");
        }
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
        tempItems = null;
    }
    
     
     // public void sendMessageOutput(String message){
       // JOptionPane.showMessageDialog(null,"Thank you for Shopping at Kohl's Department Store"
         //       + "sold to : " + custId + "/n Address" );//get custID
    //}
    
}
