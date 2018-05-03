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
public class A7Q3 {

    public static void factors() {
Scanner input = new Scanner(System.in);
        //array to store numerical values of 1-1000 in
        int[] n = new int[1000];
int factor = input.nextInt();
        //array to mark which numbers are prime or not
        boolean[] numbers = new boolean[1000];
        //set whole array to false
        for (int i = 0; i < 1000; i++) {
            numbers[i] = false;
        }
        for (int i = 1; i < factor; i++) {
            factor = n[i];
            if (factor % i == 0) {
                numbers[i] = true;
            }
        }
        System.out.println("The factors are: ");
        for (int i = 0; i < factor; i++) {
            if (numbers[i]) {
                System.out.println("" + n[i]);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to find the factors of here:");
        
        factors();

    }
}
