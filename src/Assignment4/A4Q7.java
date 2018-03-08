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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//the player starts at square 1
        int square = 1;
//the player has not won yet and must keep playing until they reach 100 and win
        while (square != 100) {
            System.out.println("Enter sum of the dice:");

            int sum = input.nextInt();
            //if the player has "rolled" an imppossible number the program will terminate  
            if (sum > 12 || sum < 1) {

                System.out.println("You Quit!");
                System.exit(sum);
            }
//the new square the player is on 
            square = sum + square;
            //if the player lands on the head of a snake and must go down it's tail
            if (square == 54) {
                square = 19;
            }

            if (square == 90) {
                square = 48;

            }
            if (square == 99) {
                square = 77;
            }
            //if the player lands at the base of a ladder and must climb it
            if (square == 9) {
                square = 34;
            }
            if (square == 40) {
                square = 64;
            }
            if (square == 67) {
                square = 86;
            }
            /*if the player has a number that is impossible because it is higher than 
             * 100 then their square will be reset and they will be told why.
             */
            if (square > 100) {
                square = square - sum;
                System.out.println("You rolled too high! Try again.");
            }
            System.out.println("You are now on square " + square);


        }

//the player wins and the game is over.
        System.out.println("Congratulations! You win!");

    }
}
