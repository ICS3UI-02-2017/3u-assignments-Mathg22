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
         while(square<100){
         System.out.println("Enter sum of the dice:");
         int sum = input.nextInt();
         square = sum + square;
         System.out.println("You are now on square " + square);
         if(square==54){
             square = 19;
         }
         
         }
         
         System.out.println("Congratulations! You are now on square 100 and you win!");
         
    }
}
