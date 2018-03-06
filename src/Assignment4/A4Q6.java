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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//use the scanner to read info
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the speed limit:");
        // set variable speedlimit to the speedlimit
        int speedlimit = input.nextInt();
        System.out.println("Enter the recorded speed of your car:");
        //set variable speed to the cars speed
        int speed = input.nextInt();
        /*if the speed of the car is a positive number and less than or equal to the speed limit 
         then tell the user they are within the speed limit
         */
        if (speed <= speedlimit && speed >= 0) {
            System.out.println("Congratulations! You are within the speed limit.");
        }
        /*set variable overlimit to how much the car is over the limit. If the user
         *is over the limit then tell them how much they must pay. If the number does not make sense 
         because it is a negative number tell the user to try again.
         */
        int overlimit = speed - speedlimit;
        if (overlimit < 0) {
            System.out.println("Do it correctly next time...");
        } else if (overlimit <= 20 && overlimit >= 1) {
            System.out.println("You are speeding and will be fined $100.");
        } else if (overlimit <= 30 && overlimit >= 21) {
            System.out.println("You are speeding and will be fined $270.");
        } else if (overlimit > 30) {
            System.out.println("You are speeding and will be fined $500.");
        }

    }
}
