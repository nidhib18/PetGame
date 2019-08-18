
package petgame;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class PetGame {

    public static void main(String[] args) throws IOException {
       
        Scanner scan = new Scanner (System.in);
        
        Dog d = new Dog("bruno",6);
        Cat c = new Cat("candy",2);
        Rabbit r = new Rabbit("Rocky",1);
        GuineaPig g = new GuineaPig("Sally",3);
        System.out.println("What kind of pet do you want:");
        File file = new File("C:\\Users\\nidhi\\Documents\\NetBeansProjects\\PetGame\\Pets.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String st; 
        while ((st = br.readLine()) != null) 
        System.out.println(st); 
        
        int choice = scan.nextInt();
    
        String choice2 = scan.nextLine();
        if (choice ==1||choice2.equalsIgnoreCase("Dog"))
        {
            System.out.println("Hello owner!I'm your friend "+Dog.name+"the Dog");
            d.DogInfo();
        }
        if (choice ==2||choice2.equals("Cat"))
        {
            System.out.println("Hello owner!I'm your friend "+Cat.name+ "the Cat");
            c.CatInfo();
        }
         if (choice ==3||choice2.equals("Rabbit"))
        {
            System.out.println("Hello owner!I'm your friend "+Rabbit.name+ "the Rabit");
            r.RabbitInfo();
        }
         if (choice ==4||choice2.equals("Guinea pig"))
        {
            System.out.println("Hello owner!I'm your friend "+GuineaPig.name+ "the Guinea pig");
            g.GuineaInfo();
        }
    }
}

    

