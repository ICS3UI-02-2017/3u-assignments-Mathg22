/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import static Assignment7.A7Q6.lastDigit;
import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A7Q7 {
public static int firstDigit(int digit){
       int a = digit;
       int first = 0;
       if(digit>0){
        while(a>10){
          a =  a/10;
        }
      Math.floor(a);
       
    }
       if(digit<0){
           
       }
       return a;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the first digit of here:");
        int digit = input.nextInt();
      int first =  firstDigit(digit); 
        
        System.out.println("The first digit is"+first);
    }
}