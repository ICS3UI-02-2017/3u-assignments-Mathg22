/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for input
        Scanner input = new Scanner(System.in);
        
        //make an array to store expenses
        double[] expenses = new double[6];
        //array to store expense names
        String[] names = {" food "," DJ ", " hall rental ", " decorations ", " staff ", " misc. "};
        //let the user know to get the cost
        System.out.println("Please enter the six costs for prom");
        //use a for loop for input
        for(int i = 0; i < expenses.length; i++){
            expenses[i] = input.nextDouble();
            //adding all the expenses
        }
            double sum = 0 ;
            for (int i = 0; i < expenses.length; i++) {
                System.out.println("How much did"+ names[i]+ "cost?");
                double expense = expenses[i];
                //add it to the sum
                sum = sum + expense;
            
                System.out.println("Prom costs "+sum);
                double ticketsNeeded = Math.ceil(sum/35);        
                System.out.println("Need to sell "+ticketsNeeded+"tickets");
        }
        
    }
}
