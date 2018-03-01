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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Asking for measurement to calculate
        System.out.println("Please enter the measurement in inches you wish to convert to centimeters:");
        //use a scanner to read the measurement      
        Scanner input = new Scanner(System.in);
//The   // next decimal entered in input is variable number. 
        double number = input.nextDouble();
        //variable cm is the centimeter value of the variable number
        double cm = number * 2.54;
        //Remind the user of the entered number and tell the user the value of the number in centimeters
        System.out.println("You entered " + number + " that is equivalent to " + cm + " cm.");
    }
}
