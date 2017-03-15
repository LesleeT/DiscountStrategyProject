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

    public abstract Product findProductById(String prodId);//product needs to be taken out, as it's
    //not a dataaccess object

    public abstract Customer findCustomerById(String custId);

     
    
}
