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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use a Scanner to read the lines in order 
        Scanner input = new Scanner(System.in);
        //Get info from scanner and assign variables to the info
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println();
        System.out.println("What was the first test out of?:");
        double test1 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double mark1 = input.nextDouble();
        System.out.println();
        System.out.println("What was the second test out of?: ");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double mark2 = input.nextDouble();
        System.out.println();
        System.out.println("What was the third test out of?:");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double mark3 = input.nextDouble();
        System.out.println();
        System.out.println("What was the fourth test out of?:");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double mark4 = input.nextDouble();
        System.out.println();
        System.out.println("What was the fifth test out of?:");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double mark5 = input.nextDouble();
        System.out.println();

        System.out.println("Test scores for " + name);
        //calculating the percent for each test
        double percent1 = mark1 / test1 * 100;
        double percent2 = mark2 / test2 * 100;
        double percent3 = mark3 / test3 * 100;
        double percent4 = mark4 / test4 * 100;
        double percent5 = mark5 / test5 * 100;
        //telling the user their results in order
        System.out.println("Test 1: " + percent1 + "%");
        System.out.println("");
        System.out.println("Test 2: " + percent2 + "%");
        System.out.println("");
        System.out.println("Test 3: " + percent3 + "%");
        System.out.println("");
        System.out.println("Test 4: " + percent4 + "%");
        System.out.println("");
        System.out.println("Test 5: " + percent5 + "%");
        System.out.println("");
        //finding the overall average
        double average = percent1 + percent2 + percent3 + percent4 + percent5;
        average /= 5;

        //telling the user their average
        System.out.println("Average: " + average + "%");
    }
}
