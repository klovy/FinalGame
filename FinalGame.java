/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

/**
 *
 * @author mikeb
 */
public class FinalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bank = 0;
        System.out.printf(Character.generateChar());
        System.out.printf(Sequence.One());
        do{
            System.out.printf(Sequence.Attack());
            bank += 25;
        }while(bank < 100);
        System.out.println(Sequence.Two());
        
    } 
    
}
