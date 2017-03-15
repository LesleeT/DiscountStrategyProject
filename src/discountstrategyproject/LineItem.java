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
public class LineItem  {
    private DataAccessStrategy db;
    private Product product;
    private int qty;
    
    public LineItem(String prodId, int qty, DataAccessStrategy db) {
        this.db = db;
//        product = db.findProductById(prodId);
        product = findProductById(prodId);
        this.qty = qty;
    }
    
   // private Product findProductById(String prodId, DataAccessStrategy db){
     //   return db.findProductById(prodId);
     //}


    

    private Product findProductById(String prodId) {
        return db.findProductById(prodId);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    

    
}
