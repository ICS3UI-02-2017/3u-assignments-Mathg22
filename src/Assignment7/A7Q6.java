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
//function method to find the last digit of any given number

    public static int lastDigit(int digit) {
        //create a string with the same value of the integer
        String number = String.valueOf(digit);
        //new variable created to be the length of the number
        int length = number.length();
        //make the variable one less than the length of the string so I can separate the last digit fromt he other digits
        length = length - 1;
        //new string created to be the last digit in the string
        String last = number.substring(length);
        //create an integer with the same value as the string so that way it will return the last digit
        int a = Integer.parseInt(last);
        //return last digit
        return a;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the last digit of here:");
        int digit = input.nextInt();
        int a = lastDigit(digit);

        System.out.println("The last digit in this number is " + a);


    }
}
