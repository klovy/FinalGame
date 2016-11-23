/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mikeb
 */
public class Sequence {
    
    public static String One(){
        System.out.println("...");
        System.out.println("Your journey is about to begin... ");
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e){
            
        }
        System.out.println("On this journey you will need to fight monsters and"
                + " defeat the Evil Queen.");
        try {
        Thread.sleep(4000);
        } catch (InterruptedException e){
            
        }
        System.out.println("");
        System.out.println("With each of the Evil Queen's monsters that you "
                + "defeat you will earn rewards. Collect enough rewards and "
                + "buy the Sword of Judgement to defeat the Queen herself.");
        try {
        Thread.sleep(4000);
        } catch (InterruptedException e){
            
        }
        System.out.println("Here comes a monster now, I hope you're ready to "
                + "begin..");
        return("");
    }
    
    public static String Attack(){
//        Attack sequence will calculate here
        System.out.println("Attack Sequence Incomplete");
        return ("");
    }
//    public static String attackOne(){
//        Scanner input = new Scanner(System.in);
//        int number;
//        int newHealth;
//        Monster monOne = new Monster("Goblin", 5, 15, 5);
//        System.out.println("It's a Goblin!"+"\nWhat do you want to do?"
//                + "\n1: Attack"+"\n2: Heal");
//        number = input.nextInt();
//        switch(number)
//            case 1: 
//
//        return("");
//    }
    public static String Two(){
        System.out.println("You've earned enough to buy the sword!");
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e){
            
        }
        System.out.println("...");
        try {
        Thread.sleep(4000);
        } catch (InterruptedException e){
            
        }
        System.out.println("Awesome! Now that you've bought the sword you can fight the Evil Queen.");
        try {
        Thread.sleep(4000);
        } catch (InterruptedException e){
            
        }
        return("");
    }
}
