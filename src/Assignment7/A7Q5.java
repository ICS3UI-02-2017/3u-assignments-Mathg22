/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author matha
 */
public class A7Q5 {
//method to generate a random number of asteriks between 1 and 5 per line for as many lines as the user desires

    public static void chaotic(int a) {
//use a for loop to randomly generate any number of astireks betweeen 1 and 5 per line 
        for (int i = 0; i < a; i++) {
            //creating a random integer between 1-5 to be the number of asteriks
            int random = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //new empty line 
            System.out.println("");
            // add the random number of asteriks to the empty line
            for (int b = 0; b < random; b++) {
                System.out.print("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("How many lines of asteriks do you want to produce? ");

        int a = input.nextInt();

        chaotic(a);
    }
}
