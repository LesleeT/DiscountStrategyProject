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
public class DiscountStrategyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PosTerminal posTerm = new PosTerminal();
        DataAccessStrategy db = new InMemoryDataAccess();
        posTerm.startSale("101", db);
        posTerm.addItemToSale("");
        posTerm.printReceipt();
        posTerm.endSale();
        
        
        
        
        
        
    }
    
}
