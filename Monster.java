/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalgame;

import java.util.Random;

/**
 *
 * @author mikeb
 */
public class Monster {
     //fields
    private String type;
    private int attack;
    private int health;
    private int speed;
    
    //constructors
    public Monster(String type, int attack, int health, int speed){
        this.type = type;
        this.attack = attack;
        this.health = health;
        this.speed = speed;
    }
    
    //methods
     public String getType(){
        return type;
    }
    public int getAttack(){
        return attack;
    }
    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    public static String generateMonster(){
        Random rand = new Random();
        int mon;

        mon = rand.nextInt(6);
            if (mon <= 3) {
                System.out.println("It's a Goblin!");
                Monster monster = new Monster("Goblin", 5, 15, 5);
            } else if ((mon > 3) && (mon <= 5)) {
                System.out.println("It's an Ogre!!");
                Monster monster = new Monster("Ogre", 15, 15, 10);
            } else {
                System.out.println("Oh Shit! It's a Knight!");
                Monster monster = new Monster("Knight", 20, 20, 10);
            }
            return("");
    }
    public static String generateBoss(){
        Monster boss = new Monster("Evil Queen", 20, 40, 15);
        
        return("");
    }
    
}
