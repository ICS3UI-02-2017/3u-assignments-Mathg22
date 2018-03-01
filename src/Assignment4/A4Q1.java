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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //use a scanner to read the name
        Scanner input = new Scanner(System.in);
        //Ask the user to type their name
        System.out.println("Please enter your name:");
        //make a string to store a name
        String name = input.nextLine();
        //Greet the user by name 
        System.out.println("Hello " + name + ". How is your day?");
    }
}
