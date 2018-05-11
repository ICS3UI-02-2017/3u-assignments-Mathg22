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

    public static int lastDigit(int digit) {
        String number = String.valueOf(digit);
        int length = number.length();
        length = length - 1;
        String last = number.substring(length);

        int a = Integer.parseInt(last);
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
