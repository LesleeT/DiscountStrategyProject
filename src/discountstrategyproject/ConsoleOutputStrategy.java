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
    public void sendMessageOutput(String message) {
        System.out.println("Message");
        }
    
}
