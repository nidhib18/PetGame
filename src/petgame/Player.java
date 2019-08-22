/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petgame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nidhi
 */
public class Player 
{
    String name;
    String player_name;
    Pets pet;
    static String username;
    
    
    //public void writeFile()

    //set up for the user input
//    Reader r = new InputStreamReader(System.in);
//    BufferedReader br = new BufferedReader(r);
//    String str = null;
//
//    try {
//            //prompt the user to input data
//            System.out.println("Type or paste your data and hit Ctrl + z");
//            PrintWriter writer = new PrintWriter("weather.txt", "UTF-8");
//            while((str = br.readLine())!=null)
//            {
//            //save the line
//
//            writer.println(str);
//            }
//            writer.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//   
//    
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
    
    
    


    

