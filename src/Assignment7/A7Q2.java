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
//method to determine what alphabetical grade the user has
public static void examGrade(int a ){
   //if the user has less than a 50 in the class the program will tell them they have an F
    if(a<50){
    System.out.println("F");
    }
    //if the users mark is between 50-59 in the class the program will tell them they have a D
    if(a<=59&&a>=50){
    System.out.println("D");
    }
    //if the users mark is between 60-69 in the class the program will tell them they have a C
    if(a<=69&&a>=60){
    System.out.println("C"); 
    }
    //if the users mark is between 70-79 in the class the program will tell them they have a B
    if(a<=79&&a>=70){
    System.out.println("B"); 
    }
    //if the users mark is higher than or is 80 then the program will tell them they have an A
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
        System.out.println("Your grade is: ");
     examGrade(a);
     
    }
}
