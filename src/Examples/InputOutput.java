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
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //print a line of text
        System.out.println("Hello World");
        System.out.println("OVO GANG");
        System.out.println("MORE LIFE");
        //printing out a blank line
        System.out.println();
        //printing on the same line
        System.out.print("I like ");
        System.out.print("cake!");
        //printing special characters
        //quotation marks
        System.out.println("\"I'm inside quotations  ");

        //slash\\
        System.out.println("A slash \\");
        //a tab
        System.out.println("pizza\tovo");
        //a new line \n
        System.out.println("One line \nSecond line");

        //make an integer
        int number = 10;
        System.out.println(number);
        System.out.println("number = " + number);
        System.out.println("number = " + number + ". YAY!");

        //use a Scanner to read info
        Scanner input = new Scanner(System.in);
       //blank line to separate
        System.out.println("");
        System.out.println("Please enter your name.");
        //make a string to stopre a name
        String name = input.nextLine();
        //say hello
        System.out.println("Hello "+name);
        
        //ask what ear they were born
        System.out.println("Hey! What year were you born?");
        //make a variable to store the year
        int birthyear = input.nextInt();
        int age = 2018 - birthyear;
        
        //you are an idiot loop
        while(age<0){
            System.out.println("Try again...");
            
        }
        System.out.println("You are about "+age +" years old.");
        
        
        if(age<0){
            System.out.println("I don't think so!");    
            
        }else if(age>30){
            System.out.println("You are old!");
        }
        


    }
}
