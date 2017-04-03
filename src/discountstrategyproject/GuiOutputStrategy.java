/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Leslee
 */
public class GuiOutputStrategy implements OutputStrategy {

    @Override
    public void sendMessageOutput(String message) throws RuntimeException {
        try{
            if(message == null || message.isEmpty()){
                JOptionPane.showMessageDialog(null,"Error");
            }
            JOptionPane.showMessageDialog(null,"This is the message of the day" );
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    
}
