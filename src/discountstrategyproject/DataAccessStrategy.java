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
public interface DataAccessStrategy {

    //public Customer custId();

    public Product findProduct(String prodId, DataAccessStrategy db);

    public Customer findCustId(String custId, DataAccessStrategy db);
    

    
}
