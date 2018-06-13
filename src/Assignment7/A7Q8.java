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

    public static boolean allDigitsOdd(int intnumber) {
        //new string created to be the value of the given number
        String number = String.valueOf(intnumber);
        //length of the string
        int length = number.length();
        //variable created equal to length of the string to be used in for loop
        int l = length;
        //new string created to be a single digit from the numbe
        String numberDigit = "";
        //boolean to tell main method if it is odd or not
        boolean odd = true;
        /*isolate each digit in the number by starting at the length and 
         working it's way down to zero to check if each digit is odd or not*/
        for (int i = length - 1; i > 0; i--, l--) {
            //new substring created to be one digit from the number at a specified location
            numberDigit = number.substring(i, l);
            //turn this digit back into an integer 
            int intdigit = Integer.parseInt(numberDigit);
            //divide the digit by 2 and if there are no remainders then the digit is even 
            if (intdigit % 2 == 0) {
                odd = false;
            }
        }
        //return the boolean value to the main method to tell it if the number is all odd or not
        return odd;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number here to determine if all of the digits are odd or not.");
        int intnumber = input.nextInt();
        System.out.println(allDigitsOdd(intnumber));


    }
}
