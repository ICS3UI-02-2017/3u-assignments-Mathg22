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
public class A7Q4 {
    //function to calculate the compound interest and return the balance 
    public static double compoundInterest(double p, double r, int n ){
        double balance = p*(Math.pow((1+r),n));
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner to read info 
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        double p = input.nextDouble();
        System.out.println("What is the interest rate?");
        double r = input.nextDouble();
        System.out.println("How much time has passed in years?");
        int n = input.nextInt();
       double balance= compoundInterest(p,r,n);
        System.out.println("The new balance of your account is "+balance);
        
        
    }
}
