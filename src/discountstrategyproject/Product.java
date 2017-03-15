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
public class Product {
    private LineItem lineItem;
    private DiscountStrategy ds;
    private String prodId;
    private String prodName;
    private double price;

    public Product(String prodId, String prodName, double price, DiscountStrategy ds) {
        this.ds = ds;
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public final String getProdId() {//get product?  include prodid?
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }
    
    public final Product getProduct(String prodId, String prodName, double price, DiscountStrategy ds){
        return lineItem.findProductById(prodId);    
    } 
    
    
}
