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
public class A7Q8 {

    public static void allDigitsOdd(int digit){
        String number = String.valueOf(digit);
        int length = number.length();
        int l = length;
        for(int i = length - 1; i>0; i--, l--){
            
            
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to determine if all of the digits are odd or not");
        int digit = input.nextInt();
        
        
        System.out.println("Each digit in this number is odd");
    }
}
