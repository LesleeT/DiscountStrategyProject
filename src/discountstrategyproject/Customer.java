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
public class Customer {
    private String custId;
    private String customerName;
    
    public Customer(String custId, String customerName) {
        setCustId(custId);
        setCustomerName(customerName);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public final String getCustId() {
        //getCustId
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    
}
