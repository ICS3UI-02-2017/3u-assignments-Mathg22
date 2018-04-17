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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //set input as scanner to read info
        Scanner input = new Scanner(System.in);
        //ask user for number of students
        System.out.println("How many students are in the class?");
        //set i to be the number of students 
        int i = input.nextInt();
        //create an array to store the marks in. Make the array as long as the number of students
        double[] marks = new double[i];
        //ask user for marks
        System.out.println("Please enter the marks");
        //use a for loop to store the marks in the array
        for (int m = 0; m < marks.length; m++) {
            marks[m] = input.nextDouble();
        }
        //adding all the marks
        double sum = 0;
        for (int a = 0; a < marks.length; a++) {
            double grade = marks[a];
            sum = sum + grade;

        }
        //take the sum of the marks, divide by number of students and round to two decimal places
        double average = Math.round(sum / i * 100) / 100.0;
        //tell the user the average 
        System.out.println("The class average is " + average + "%.");
    }
}
