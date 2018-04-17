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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //set input as scanner to read info
        Scanner input = new Scanner(System.in);
        //ask user for number of people
        System.out.println("How many people are being evaluated?");
        //set i to be the number of students 
        int i = input.nextInt();
        //create an array to store the heights in. Make the array as long as the number of people
        double[] heights = new double[i];
        //ask user for heights
        System.out.println("Please enter the heights");
        //use a for loop to store the heights in the array
        for (int m = 0; m < heights.length; m++) {
            heights[m] = input.nextDouble();
        }
        //adding all the heights
        double sum = 0;
        for (int a = 0; a < heights.length; a++) {
            double height = heights[a];
            sum = sum + height;
        }
        //empty string to store the heights that are above average
        String tall = "";
        //caclulate average
        double average = sum / i;
        /*use a for loop to sort through the heights and 
         select the above average heights to be added to the tall string*/
        for (int a = 0; a < heights.length; a++) {
            double height = heights[a];
            if (height > average) {
                tall = tall + height + ", ";
            }

        }
        //tell the user which heights are above average
        System.out.println("" + tall);
    }
}