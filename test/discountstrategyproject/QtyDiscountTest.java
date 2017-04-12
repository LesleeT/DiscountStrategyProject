/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ltrinastic
 */
public class QtyDiscountTest {
    private QtyDiscount instance;
    
    public QtyDiscountTest() {
    }
    
    @Before
    public void setUp() {
        instance = new QtyDiscount();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getDiscountAmount method, of class QtyDiscount.
     */
//    @Test
//    public void testGetDiscountAmount() {

//    }

    /**
     * Test of getDiscountRate method, of class QtyDiscount.
     */
//    @Test
//    public void testGetDiscountRate() {
    
//    }

    /**
     * Test of setDiscountRate method, of class QtyDiscount.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDiscountRate() {;
        instance.setDiscountRate(0);
    }

    /**
     * Test of getMinimumQty method, of class QtyDiscount.
     */


    /**
     * Test of setMinimumQty method, of class QtyDiscount.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetMinimumQty() {
        instance.setMinimumQty(0);
    }
    
}
