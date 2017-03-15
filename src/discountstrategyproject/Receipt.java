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
    private Customer customer;
    
    public Receipt(String custId, DataAccessStrategy db) {
        customer = findCustomer(custId, db);
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
    public Customer findCustomerById(String custId) {
        return db.findCustomerById(custId);
    }
    
    private double getLineItemSubtotal(LineItem item) {
        return item.getProduct().getPrice() * item.getQty();
    }
    
    private double getLineItemDiscount(LineItem item) {
        return item.getProduct().getDs().getDiscountAmount(item.getProduct().getPrice(), item.getQty());
    }
     
    public void oututReceipt() {
        String data = "";
        data += "Thank you for shopping at Kohls\n";
        data += "\n";
        data += "Date of Sale: 3/11/2017\n";
        data += "Sold to: " + customer.getCustomerName() + "\n";
        data += "\n";
        data += "Prod ID    Item          Price     Qty     Subtotal    Discount\n";
        for(LineItem item : lineItems) {
            data += item.getProduct().getProdId() + "     " + item.getProduct().getProdName()
                    + "      " + item.getProduct().getPrice() +
                    item.getQty() + "      " + getLineItemSubtotal(item)
                            + "    " + getLineItemDiscount(item);
        }
    }

}
