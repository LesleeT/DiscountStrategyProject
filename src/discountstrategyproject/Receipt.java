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
public class Receipt implements DataAccessStrategy{
    private DataAccessStrategy db;
    private LineItem[] lineItems;
    
    public Receipt(String custId, DataAccessStrategy db) {
        
    }
    
    private Customer findCustomer(String custId, DataAccessStrategy db){
        return db.findCustomerById(custId);
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

    public final void getReceiptData(){
        return;
    }
    
    
    @Override
    public Product findProductById(String prodId) {
        return db.findProductById(prodId);
    }

    @Override
    public Customer findCustomerById(String custId) {
        return db.findCustomerById(custId);
    }
     
    
}
