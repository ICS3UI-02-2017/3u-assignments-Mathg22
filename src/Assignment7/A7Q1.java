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
public class A7Q1 {
//calculates the area of a circle

    public static double circleArea() {
        //to read info
        Scanner input = new Scanner(System.in);
        //the double to store the radius that the user entered
        double r = input.nextDouble();
        //calculatuing the area
        double A = 3.14 * (Math.pow(r, 2));
        //send back so that way circleArea now has a value
        return A;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ask the user for the radius
        System.out.println("What is the radius? Please add the decimal even if your number is a whole number.");
        //perform function circleArea
        circleArea();


        System.out.println("The area of this circle is " + circleArea());
    }
}
