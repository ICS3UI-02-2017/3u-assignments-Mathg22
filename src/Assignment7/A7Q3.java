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
public class A7Q3 {
//method to determine the factors of any given integer
    public static void factors() {
        Scanner input = new Scanner(System.in);
        //create a varaible to represent the number desired by the user
        int factor = input.nextInt();
//array to store numerical values of 0 to the number inputed by the user
        int[] n = new int[(factor + 1)];
//use a for loop to assign numbers to the array
        for (int i = 0; i < (factor + 1); i++) {
            n[i] = i;
        }
        //array to mark which numbers are factors or not
        boolean[] numbers = new boolean[(factor + 1)];
        //set whole array to false
        for (int i = 0; i < (factor + 1); i++) {
            numbers[i] = false;
        }
        //use for loop to find the factors of the number
        for (int i = 1; i < (factor + 1); i++) {

            if (factor % i == 0) {
                numbers[i] = true;
            }
        }
        //tell the user the factors using a for loop
        System.out.println("The factors are: ");
        for (int i = 1; i < (factor + 1); i++) {
            if (numbers[i]) {
                System.out.println("" + n[i]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to find the factors of here:");

        factors();

    }
}
