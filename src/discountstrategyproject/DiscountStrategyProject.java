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
       OutputStrategy output = new GuiOutputStrategy();
       OutputStrategy output2 = new ConsoleOutputStrategy();
        PosTerminal posTerminal = new PosTerminal(output,output2);
        DataAccessStrategy db = new InMemoryDataAccess();
        
        posTerminal.startSale("101", db);
        posTerminal.addItemToSale("201", 1);
        posTerminal.endSale();
        
        
        
        
        
        
    }
    
}
