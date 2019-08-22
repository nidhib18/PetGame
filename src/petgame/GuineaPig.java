package petgame;
import java.util.Scanner;

public class GuineaPig extends Pets
        
{
    public GuineaPig(String name, int age) {
        super(name, age);
    }
    public void talk(){
        mood = Math.abs(rand.nextInt(100));
        energy =Math.abs(rand.nextInt(100));
        System.out.println(name+"munchmunch");
        System.out.println("Mood:" +mood+  "Energy:" +energy+ "full:"+full );

    }
     public void GuineaInfo()
     {
         
          Scanner sc = new Scanner(System.in);
         for(int i = 0; i < 5; i++){
         System.out.println("What would you like your Guinea pig to do 1.feed 2.play 3.sleep");
         int select = sc.nextInt();
         
         if(select == 1){
             System.out.println("Your Guinea pig," +name+ "is eating");
             feed();
         }
         if(select == 2)
         {   
             System.out.println("Your Guinea pig," +name+ "is playing");
             play();
         }
         if(select == 3)
         {   
             System.out.println("Your Guinea pig," +name+ "is sleeping");
             sleep();
         }
         if(select == 4)
         {   
             System.out.println("Your Guinea pig," +name+ "is talking");
             talk();
         }
         }
         sleep();
         System.out.println("Its the end of the day :) Your Guinea pig is sleeping");
     }
     
}
         
