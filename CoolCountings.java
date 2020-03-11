/*
 * Launa Bucher-Austin
 * This program will count by a certain interval and value that is chosen by the user. 
 * March 10 2020
 */

package coolcountings;

import java.util.Scanner;

/**
 *
 * @author labuc9806
 */
public class CoolCountings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner (System.in) ;
     
      int response;
      
        System.out.println("Please Enter Your Choice");
        System.out.println("1. Count from 0 to 10 by 1");
        System.out.println("2. Count from 100 to 0 by 10");
        System.out.println("3. Count from 50 to 500 by 50");
        System.out.println("4. Count from 6000 to 1000 by 1000");
        response = keyedInput.nextInt();
        
        if (response == 1)
        {
            System.out.println("You have chosen to count from 0 to 10 by 1.");
            
            for (int i = 0; i <= 10; i = i + 1)
            {
                System.out.println(i);
            }
            
        }
        
        if (response == 2)
        {
            System.out.println("You have chosen to count from 100 to 0 by 10.");
            
            for (int i = 100; i >= 0; i = i - 10)
            {
                System.out.println(i);
            }
        }
        
        if (response == 3)
        {
            System.out.println("You have chosen to count from 50 to 500 by 50.");
            
            for (int i = 50; i <=  500; i = i+50)
            {
                System.out.println(i);
            }
        }
        
        if (response == 4)
        {
            System.out.println("You have chosen to count from 6000 to 1000 by 1000.");
            
            for (int i = 6000; i >= 1000; i = i - 1000 )
            { 
                System.out.println(i);
            }
               
        }
        
         
        
    }
    
}
