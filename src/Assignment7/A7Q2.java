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
public class A7Q2 {

public static void examGrade(int a){
    if(a<50){
    System.out.println("F");
    }
    if(a<=59&&a>=50){
    System.out.println("D");
    }
    if(a<=69&&a>=60){
    System.out.println("C"); 
    }
    if(a<=79&&a>=70){
    System.out.println("B"); 
    }
    if(a>=80){
    System.out.println("A"); 
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("What is your mark?");
     int a = input.nextInt();
     
    }
}
