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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initialize scanner to read info
        Scanner input = new Scanner(System.in);
        //ask the user how many marks are wanted
        System.out.println("How many students are in the class?");
        //created variable to be the desired amount of marks
        int v = input.nextInt();
        //created array to hold the desired amount of marks
        double[] marks = new double[v];
        //ask the user for the marks
        System.out.println("Please enter the marks:");
        //use a for loop to store the marks in the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        //created integer to store the length of the array
        int length = marks.length;


        //varaible created that is one less than array length to be used to limit for loops
        int c = marks.length - 1;
        /*use a for loop to analyze each mark in the array by starting at the start of the 
         array and going up by one to the end and switching the values where 
         need to make the array in ascending order*/
        for (int i = 0; i < c; i++) {
            //varaible to store the mark at the position i in the array
            double AA = marks[i];
            //varaible to store the mark at the position one higher than i in the array
            double AB = marks[(i + 1)];
            //varaible to be the position 1 higher than i of the array
            int a = (i + 1);
            //switch the arrays marks if the mark after i is higher than the mark at i
            if (marks[i] > marks[(a)]) {
                marks[i] = AB;
                marks[(i + 1)] = AA;
            }
            /*use a for loop to analyze each mark in the array by starting at the end of the 
             array and going down by one to the start and switching the values where 
             need to make the array in ascending order*/
            for (int d = c; d > 0; d--) {
                //varaible to store the mark at the position d in the array
                AA = marks[d];
                //varaible to store the mark at the position one lower than i in the array
                AB = marks[(d - 1)];
                //varaible to be the position 1 lower than d of the array
                int e = (d - 1);
                //switch the arrays marks if the mark before d is higher than the mark at d
                if (marks[e] > marks[d]) {
                    marks[d] = AB;
                    marks[(d - 1)] = AA;
                }
            }

        }
        //tell the user the highest and lowest marks
        System.out.println("The lowest mark is a " + marks[0] + "% and the highest mark is a " + marks[c] + "%.");
        //created new integer to store the sum of the marks in
        double sum = 0;
        //using a for loop add all the marks in the array together
        for (int i = 0; i < marks.length; i++) {
            // get the mark
            double mark = marks[i];
            // add it to the sum
            sum = sum + mark;
        }
        //integer to store the caclulated average that has been rounded down to 2 decimal spaces
        double average = (sum / length * 100.0) / 100.0;
        //tell the user the class average
        System.out.println("The class average is " + average + "%.");
    }
}
