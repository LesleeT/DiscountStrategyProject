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
public class Receipt {
    DataAccessStrategy db;
    Customer customer;
    private LineItem[] lineItems;
    
    public Receipt(String custId, DataAccessStrategy db) {
        
    }
    
    private final Customer findCustomer(String custId, DataAccessStrategy db){
        return db.findCustId(custId,db);
    }

    public final void addLineItem(String prodId, int qty,DataAccessStrategy db) {
       LineItem item = new LineItem(prodId, qty, db);
    }
    
}
