/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         int square = 1;
         int number = 0;
         while(square!=100&&number!=5){
         System.out.println("Enter sum of the dice:");
        int sum = input.nextInt();
         if(sum>12||sum<0){
             number = 5;
         }

         
         if(square==54){
             square = 19;
         }
         
         if(square==90){
         square = 48;    
         
         }
         if(square==99){
             square = 77;
         }
         if(square==9){
             square = 34;
         }
         if(square==40){
             square = 64;
         }
         if(square==67){
             square = 86;
         }
                  square = sum + square;
         System.out.println("You are now on square " + square);
         
         }
         if(number==5){
             System.out.println("You Quit!");
         }
         if(square==100){
            System.out.println("Congratulations! You win!");  
         }
         }
        
         
    
}
