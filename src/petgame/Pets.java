
import static petgame.Levels.energy;
import static petgame.Levels.full;
import static petgame.Levels.mood;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIANNE
 */
public abstract class Pets 
{
    public static String name;
    public static int age;
    int mood;
    int energy;
    int full;
   
    
    public Pets (String name,int age)
    {
       Pets.name = name;
       Pets.age = age;
    }
    
    public void feed ()
    {
        
        System.out.println("Thank you");
    }
    public void sleep ()
    {
        System.out.println("ZZzzzzz");
    }
    
    public void play ()
    {
        System.out.println("This is so fun!");
    }
    public abstract void talk ();
    
     public int Fullness(double min, double max)
    {
        
       full=(int) ((int) (Math.random()*((max-min)+1))+min);
       System.out.print(" Fullness:" +full);
       return full;
        
    }
     public int Mood(double min, double max)
    {
       mood=(int) ((int) (Math.random()*((max-min)+1))+min);
       System.out.print(" Mood:" +mood);
       return mood;
        
    }
     public int Energy(double min, double max)
    {
       energy=(int) ((int) (Math.random()*((max-min)+1))+min);
       System.out.print(" Energy:" +energy);
       return energy;
        
    }
            
    
}
