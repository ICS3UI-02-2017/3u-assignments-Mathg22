/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A7Q6 {

    public static int lastDigit(int digit){
         for(int a = digit; a>1; ){
            
             
         }
      return digit;
        
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the last digit of here:");
        int digit = input.nextInt();
        lastDigit(digit); 
        
        
    }
}
