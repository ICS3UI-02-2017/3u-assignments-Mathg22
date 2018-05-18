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

    public static int allDigitsOdd(int digit){
        String number = String.valueOf(digit);
        int length = number.length();
        int lastint = length - 1;
        String last = number.substring(length);
        return lastint;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the last digit of here:");
        int digit = input.nextInt();
        int a = allDigitsOdd(digit);
        
    }
}
