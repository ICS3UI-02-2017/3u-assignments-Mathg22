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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[10];
        System.out.println("Please enter the ten marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        for (int i = 0; i < marks.length; i++) {
            int AA = marks[i];
            int AB = marks[(i+1)];
            if(marks[i]>marks[(i+1)]){
                marks[i] = AB;
            marks[(i+1)] = AA;
            }
        }
        System.out.println("The marks in ascending order is "+ marks[0]+" "+ marks[1]+" "+ marks[2]+" "+ marks[3]+" "
                + marks[4]+" "+ marks[5]+" "+ marks[6]+" "+ marks[7]+" "+ marks[8]+" "+ marks[9]);
    }
}
