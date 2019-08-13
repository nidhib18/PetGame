package petgame;

import petgame.Pets;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIANNE
 */

public class Dog extends Pets
{ 
    public Dog()
    {
        super(name,age);
        
    }
    
    @Override
    public void feed(){
        
        this.full += 10;
        this.mood +=10;
        this.energy +=10;
        
        System.out.print(" Mood:" +mood+  "Energy:" +energy+ "full:"+full );
        
        
   }
    
    @Override
    public void sleep(){
        
        this.mood +=10;
        this.energy +=10;
   }

  
   
    @Override
    public void play(){
       
        this.mood +=10;
        this.energy -=10;
   }
    
    @Override
    public void talk(){
        
        this.mood +=10;
        this.energy -=10;
   }
    
    @Override
     public String toString() {
        return "Dog:" +super.toString();
    }
   
    
   
    
}

