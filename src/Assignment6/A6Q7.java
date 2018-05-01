/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Mathg8825
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //array to store numerical values of 1-1000 in
        int[] n = new int[1000];
        //array to mark which numbers are prime or not
        boolean[] numbers = new boolean[1000];
        //set whole array to true
        for (int i = 0; i < 1000; i++) {
            numbers[i] = true;
        }
        //set 0 and 1 as false because they can not be prime numbers
        numbers[0] = false;
        numbers[1] = false;
        //create the values of 1-1000
        for (int i = 0; i < 1000; i++) {
            n[i] = i;
        }

        int p = 0;
        //starting at 3 because 2 is a prime number
        //check all numbers between 3-1000 if they are a factor of 2. If they are have them equal false
        for (int i = 3; i < 1000; i++) {
            int number = n[i];
            if (number % 2 == 0) {
                numbers[i] = false;
            }
        }
        //starting at 4 because 3 is a prime number
        //check all numbers between 4-1000 if they are a factor of 3. If they are have them equal false
        for (int i = 4; i < 1000; i++) {
            int number = n[i];
            if (number % 3 == 0) {
                numbers[i] = false;

            }
        }
        //starting at 6 because 5 is a prime number
        //check all numbers between 6-1000 if they are a factor of 5. If they are have them equal false
        for (int i = 6; i < 1000; i++) {
            int number = n[i];
            if (number % 5 == 0) {
                numbers[i] = false;

            }
        }
        //starting at 8 because 7 is a prime number
        //check all numbers between 8-1000 if they are a factor of 7. If they are have them equal false
        for (int i = 8; i < 1000; i++) {
            int number = n[i];
            if (number % 7 == 0) {
                numbers[i] = false;

            }

/*using the for loop to use the new prime numbers to eliminate other factors of themselves 
 which say they are prime numbers when really they are a factor of this new prime number. 
 Starts from the bottom to ensure all other numbers with this factor are eliminated.*/
            for (int b = 11; b < 1000; b++) {
                if (numbers[b]) {

                    for (i = (b + 1); i < 999; i++) {
                        int numb = n[i];
                        if (numb % b == 0) {
                            numbers[i] = false;
                        }
                    }
                }

            }
            //tell user prime numbers using a for loop that tells the user all the numbers with a true value
            System.out.println("The prime numbers are: ");
            for (i = 2; i < 1000; i++) {
                if (numbers[i]) {
                    System.out.println("" + n[i]);
                }
            }
        }
    }
}
