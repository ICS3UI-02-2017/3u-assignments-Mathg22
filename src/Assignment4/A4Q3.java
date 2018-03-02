/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //use a Scanner to read the lines in order 
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in 4 numbers on separate lines:");
        //use strings to store the numbers 
        String firstline = input.nextLine();
        String secondline = input.nextLine();
        String thirdline = input.nextLine();
        String fourthline = input.nextLine();
        //use the strings to tell the user the numbers
        System.out.println("Your numbers were " + firstline + "," + secondline + "," + thirdline + ",and " + fourthline);
    }
}
