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
        int c = scan.nextInt();
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
//        Levels level = new Levels();
////        level.Fullness(50,100);
////        level.Energy(50, 100);
////        level.Mood(50, 100);
      Dog d = new Dog();
//        d.feed();
//        level.Energy(10, 100);

        System.out.println("What would you like your pet to do: 1.Feed it 2.Play 3.Sleep 4.Talk");
        if(c ==1)
        {
            d.feed();
        }
        if(c == 2)
        {
            d.play();
        }
        if(c == 3)
        {
            d.sleep();
        }
        if(c == 4)
        {
            d.talk();
        }
    };
        //d.play();
        

}//
    

