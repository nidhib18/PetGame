/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petgame;

/**
 *
 * @author nidhi
 */
public class Levels {
    
    
    public static int full;
    public static int mood;
    public static int energy;
    
    
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