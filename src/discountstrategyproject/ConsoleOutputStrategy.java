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
public class ConsoleOutputStrategy implements OutputStrategy {

    @Override
    public void sendMessageOutput(String message) throws IllegalArgumentException {
        try{
            if(message == null || message.isEmpty()){
                System.out.println("Please enter in a message");
            }
            System.out.println("Message");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        }
    
}
