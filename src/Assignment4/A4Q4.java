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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        //use a Scanner to read the lines in order and use doubles to assign those numbers to the desired variable
        Scanner input = new Scanner(System.in);
        System.out.println("How much does the food for prom cost?: ");
        double food = input.nextDouble();
        System.out.println("How much does the DJ cost?: ");
        double dj = input.nextDouble();
        System.out.println("How much does it cost to rent the hall?: ");
        double hall = input.nextDouble();
        System.out.println("How much does decorations cost?: ");
        double decor = input.nextDouble();
        System.out.println("How much does it cost for staff?: ");
        double staff = input.nextDouble();
        System.out.println("How much for miscellaneous costs?: ");
        double misc = input.nextDouble();
        //calculate the total cost
        double total = food + dj + hall + decor + staff + misc;
        //calculate the total amount of tickets rounded up because you can not have 0.8 of a ticket
        double tickets = Math.ceil(total / 35);
        //tell the user the total cost and the amount of tickets that need to be sold   
        System.out.println("The total cost will be: $" + total + " and you will need to sell " + tickets + " tickets to break even.");




    }
}
