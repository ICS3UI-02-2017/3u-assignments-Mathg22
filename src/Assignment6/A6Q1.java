/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author mathg8825
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("How many students are in the class?");
        int i = input.nextInt();
        
        double[] marks = new double[i];
        Double d = new Double(i);
        for(int a = 0; a < marks.length; a++){
            marks[a] = input.nextDouble();
        }
        double average = 0;
       // average = marks/d;
    }
}
