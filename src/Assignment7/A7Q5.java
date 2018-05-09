/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author matha
 */
public class A7Q5 {
//method to generate a random number of asteriks between 5 and 1 

    public static void chaotic(int a) {

        for (int i = 0; i < a; i++) {
            int random = (int) (Math.random() * (5 - 1 + 1)) + 1;
            System.out.println("");
            for (int b = 0; b < random; b++) {
                System.out.print("*");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int a = (int) (Math.random() * (100 - 1 + 1)) + 1;

        chaotic(a);
    }
}
