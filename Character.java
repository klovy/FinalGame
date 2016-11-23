package finalgame;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikeb
 */
public class Character {
    //fields
        private String type;
        private int attack;
        private int health;
        private int speed;
    
    
    //constructors
    public Character(String type, int attack, int health, int speed){
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
    public int setDefense(int defense){
        return defense;
    }
    public static String generateChar(){
        Scanner input = new Scanner(System.in);
        int number;
        int bank = 0;

        System.out.println("What class will you be?");
        System.out.println("1: Titan");
        System.out.println("2: Hunter");
        System.out.println("3: Warlock");
        System.out.print(": ");
        number = input.nextInt();

        Character myCharacter = new Character("Titan", 20, 100, 5);
        
        switch (number) {
            case 1: {
                System.out.println("Congratulations! You have chosen the "
                        + " mighty Titan.");
                myCharacter = new Character("Titan", 20, 100, 5);
                break;
            }
          case 2:{
              System.out.println("Congratulations! You have chosen the"
              + " brave Hunter.");
              myCharacter = new Character("Hunter", 10, 50, 20);
              break;
            }
          case 3:{
              System.out.println("Congratulations! You have chosen the"
            + " fierce Warlock");
              myCharacter = new Character("Warlock", 15, 75, 15);
              break;
            }
          case 31337:{
              System.out.println("....");
              System.out.println("You have unlocked a secret character..");
              myCharacter = new Character("Master", 30, 300, 30);
              break;
            }
            default: {
                System.out.println("Invalid input");
                break;
            }
        }
        return myCharacter.toString();       
    }
       @Override
       public String toString(){
           return String.format("%s, Attack = %d, Health = %d, Speed = %d\n", getType(), getAttack(), getHealth(), getSpeed());
           }
}

