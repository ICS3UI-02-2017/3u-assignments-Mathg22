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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set input as scanner to read info
        Scanner input = new Scanner(System.in);
        //ask the user how many marks are wanted
        System.out.println("How many marks do you wish to enter?");
        //created variable to be the desired amount of marks
        int v = input.nextInt();
        //created array to hold the desired amount of marks
        int[] marks = new int[v];
        //ask the user for the marks
        System.out.println("Please enter the marks:");
        //use a for loop to store the marks in the array
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        //varaible created that is one less than array length to be used to limit for loops
        int c = marks.length - 1;
        /*use a for loop to analyze each mark in the array by starting at the start of the 
         array and going up by one to the end and switching the values where 
         need to make the array in ascending order*/
        for (int i = 0; i < c; i++) {
            //varaible to store the mark at the position i in the array
            int AA = marks[i];
            //varaible to store the mark at the position one higher than i in the array
            int AB = marks[(i + 1)];
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
        //using a for loop tell the user the marks in ascending order
        System.out.println("The marks in ascending order are ");
        for (v = 0; v < marks.length; v++) {
            System.out.println("" + marks[v]);
        }
        //varaible to store the median value
        double median = 0;
        //if the length of the array is an even number then perform the needed actions to find the median
        if (marks.length % 2 == 0) {
            int m = marks.length / 2;
            int n = m - 1;
            //add the numbers at the two most middle spots of the array and divide by 2 to find the median
            median = (marks[m] + marks[n]) / 2.0;
        }
        //if the length of the array is an odd number then perform the needed actions to find the median
        if (marks.length % 2 != 0) {
            int m = marks.length / 2;
            median = marks[m];
        }
        //tell the user the median
        System.out.println("The median is " + median);
    }
}
