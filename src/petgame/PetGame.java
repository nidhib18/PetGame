
package petgame;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class PetGame {

    public static void main(String[] args) throws IOException {
        Dog d = new Dog("bruno",6);
        Cat c = new Cat("candy",2);
        Rabbit r = new Rabbit("Rocky",1);
        GuineaPig g = new GuineaPig("Sally",3);
        //
        System.out.println("What kind of pet do you want (choose 1 for Dog, 2 for Cat, 3 for Rabbit, 4 for Guinea Pig):");
        File file = new File("Pets.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String st; 
        while ((st = br.readLine()) != null) 
        System.out.println(st); 
        //.writeFile();
        Scanner scan = new Scanner (System.in);
        String choice = scan.nextLine();
        //String choice2 = scan.nextLine();
        

        if (choice.equals("1")||choice.equalsIgnoreCase("dog")) 
        {
            System.out.println("Hello owner!I'm your friend "+Dog.name+"the Dog");
           
                d.DogInfo(); 
        }
        if (choice.equals("2")||choice.equalsIgnoreCase("Cat"))
        {
            System.out.println("Hello owner!I'm your friend "+Cat.name+ "the Cat");
            c.CatInfo();
        }
          if (choice.equals("3")||choice.equalsIgnoreCase("Rabbit"))
        {
            System.out.println("Hello owner!I'm your friend "+Rabbit.name+ "the Rabit");
            r.RabbitInfo();
        }
         if (choice.equals("4")||choice.equalsIgnoreCase("Guinea pig"))
        {
            System.out.println("Hello owner!I'm your friend "+GuineaPig.name+ "the Guinea pig");
            g.GuineaInfo();
        }
        
         
    
        
      
}
}
    

