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
    //function method to find and return the first digit in the number

    public static int firstDigit(int digit) {
        //create new variable to be the value of the given number
        int a = digit;
        int first = 0;
        //if the number is positive divide by ten until there is no longer a number in the tens place
        if (digit > 0) {
            // divide by ten until the number is less than 10
            while (a >= 10) {
                a = a / 10;
            }
            //round the number down to get rid of all of the decimals leaving the first digit in the number left
            Math.floor(a);

        }
        //if the number is negative divide by ten until there are no more numbers in the tens place
        if (digit < 0) {
            //divide by ten until the number is greater than - 10
            while (a <= -10) {
                a = a / 10;
            }
            //round the number down to get rid of all of the decimals leaving the first digit in the number left
            Math.floor(a);
            //make this number positive 
            a = a * -1;

        }
        //return the first digit
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the first digit of here:");
        int digit = input.nextInt();
        int first = firstDigit(digit);
        System.out.println("The first digit is " + first);
    }
}