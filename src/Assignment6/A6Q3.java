/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set input as scanner to read info
        Scanner input = new Scanner(System.in);
        //create an array to store the integers in
        int[] A = new int[2];
        //ask user for the two integers
        System.out.println("Enter two integers:");
        //use a for loop to store the two integers into the array
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        //store the values of the array into separate integers
        int AA = A[0];
        int AB = A[1];
        /*if the numbers are not ascending then rearrange the values to make them 
         ascending by using the integers created earlier*/
        if (A[0] > A[1]) {
            A[0] = AB;
            A[1] = AA;

        }
        //tell the user the integers in ascending order
        System.out.println("The integers in ascending order are " + A[0] + " and " + A[1]);
    }
}
