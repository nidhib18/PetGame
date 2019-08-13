/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petgame;

import java.util.Scanner;

/**
 *
 * @author nidhi
 */
public class PetGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scan = new Scanner (System.in);
        System.out.println("Choose your pet by the number");
        int choice = scan.nextInt();
        String choice2 = scan.nextLine();
        if (choice ==1||choice2.equalsIgnoreCase("Dog"))
        {
            System.out.println("Hello owner!I'm your friend doggie");
            
        }
        if (choice ==2||choice2.equals("Cat"))
        {
            System.out.println("Hello owner!I'm your friend doggie");
        }
         if (choice ==3||choice2.equals("Rabbit"))
        {
            System.out.println("Hello owner!I'm your friend doggie");
        }
         if (choice ==4||choice2.equals("Guinea pig"))
        {
            System.out.println("Hello owner!I'm your friend doggie");
        }
        Levels level = new Levels();
        level.Fullness(50,100);
        level.Energy(50, 100);
        level.Mood(50, 100);
        Dog d = new Dog();
        d.feed();
        d.feed();
    }
    
}
