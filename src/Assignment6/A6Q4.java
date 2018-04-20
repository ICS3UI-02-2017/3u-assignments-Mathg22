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
        int b = 9;
        for (int c = 0; c < 9; c++) {
            for (int i = c; i < 9; i++) {
                int AA = marks[i];
                int AB = marks[(i + 1)];
                int a = (i + 1);
                if (marks[i] > marks[(a)]) {
                    marks[i] = AB;
                    marks[(i + 1)] = AA;
                    if (i > 1) {
                        for (int x = (i - 1); x < 9; x++) {
                            AA = marks[x];
                            AB = marks[(x + 1)];
                            a = (x + 1);
                            if (marks[i] > marks[(a)]) {
                                marks[x] = AB;
                                marks[(x + 1)] = AA;

                            }
                        }
                    }
                }

            }
        }
        System.out.println("The marks in ascending order is " + marks[0] + " " + marks[1] + " " + marks[2] + " " + marks[3] + " "
                + marks[4] + " " + marks[5] + " " + marks[6] + " " + marks[7] + " " + marks[8] + " " + marks[9]);
    }
}
