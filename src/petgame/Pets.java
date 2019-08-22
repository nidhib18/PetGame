package petgame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public abstract class Pets 
        
{
    Scanner scan = new Scanner(System.in);
    static String name;
    static int age;
    public Pets (String name,int age)
    {
       Pets.name = name;
       Pets.age = age;
    }
    
    Random rand = new Random();
    int full = Math.abs(rand.nextInt(100));
    int mood = Math.abs(rand.nextInt(100));
    int energy = Math.abs(rand.nextInt(100));
  
    public  void feed(){
       
        mood += Math.abs(rand.nextInt(100));
        energy += Math.abs(rand.nextInt(100));
        full += Math.abs(rand.nextInt(100));
        System.out.println(name+":Yummm");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full);
    }
    
    public void sleep(){
        
        mood += Math.abs(rand.nextInt(100));
        energy += Math.abs(rand.nextInt(100));
        full += Math.abs(rand.nextInt(100));
        System.out.println(name+"ZZZZzzz..");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );
   }
    
    public void play(){
       
        mood += Math.abs(rand.nextInt(100));
        energy -= Math.abs(rand.nextInt(100));
        full -= Math.abs(rand.nextInt(100));
        System.out.println(name+"YAyyyy");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );
   } 
   public static void writeFile () throws IOException
    {
        Scanner scan = new Scanner (System.in);
        String username = scan.nextLine();
        
            BufferedWriter w = new BufferedWriter(new FileWriter("files.txt"));
            w.write (username);
            w.write(Pets.name);
            w.write(Pets.age);
            w.close();
            
       System.out.println("Please name and age your pet:");
       Pets.name = scan.nextLine();
       Pets.age = scan.nextInt();
       System.out.println("I'm"+" " + Pets.name + " &" + Pets.age + "years old");
   }
            
}

     
     
    

            
    

