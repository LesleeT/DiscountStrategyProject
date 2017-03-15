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
public class LineItem implements DataAccessStrategy {
    private DataAccessStrategy db;
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DataAccessStrategy db) {
        product = db.findProductById(prodId);
        this.qty = qty;
    }
    
   // private Product findProductById(String prodId, DataAccessStrategy db){
     //   return db.findProductById(prodId);
     //}


    @Override
    public Customer findCustomerById(String custId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findProductById(String prodId) {
        return db.findProductById(prodId);
    }

    

    
}
