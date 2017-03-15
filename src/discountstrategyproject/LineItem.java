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
public class LineItem {
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DataAccessStrategy db) {
        product = findProduct(prodId, db);
        this.qty = qty;
    }
    
    private final Product findProduct(String prodId, DataAccessStrategy db){
        return db.findProduct(prodId, db);
    }
    
}
