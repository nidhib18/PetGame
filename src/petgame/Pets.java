package petgame;




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
    int mood,energy,full,eat,sleep,play,talk;
   
   
    
    public Pets (String name,int age)
    {
       Pets.name = name;
       Pets.age = age;
       
    }
    public Pets()
    {
        this.eat = 0;
        this.sleep = 0;
        this.play = 0;
        this.talk = 0;
    }
    
    public void feed ()
    {
    
    }
    public void sleep ()
    {
        
    }
    
    public void play ()
    {
       
    }
    public abstract void talk ();

    @Override
    public String toString() {
        return "Pets{" + "mood=" + this.mood + ", energy=" + this.energy + ", full=" + this.full + ", eat=" + this.eat + ", sleep=" + this.sleep + ", play=" + this.play + ", talk=" + this.talk + '}';
    }
    
     
     
    

            
    
}
