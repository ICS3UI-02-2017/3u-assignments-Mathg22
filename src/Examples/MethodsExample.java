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
public class MethodsExample {

    //The hello world method to say hello
    public static void helloWorld(){
        System.out.println("Hello world!");
    }
    //calculates positive root of quadratic formula
    public static double posQuadFormula(double a, double b, double c){
        double discrim= b*b - 4*a*c;
        double root = (-b + Math.sqrt(discrim))/(2*a);
        //send back
        return root;
    }
    public static double[] quadFormula(double a, double b, double c){
        //create the array to store both roots
        double[] roots = new double[2];
        double discrim= b*b - 4*a*c;
         roots[0] = (-b + Math.sqrt(discrim))/(2*a);
         roots[1] = (-b - Math.sqrt(discrim))/(2*a);
        //send back
        return roots;
    }
    //say hello to a user
    public static void sayHello(String name){
            System.out.println("Hello"+name);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        helloWorld();
        System.out.println("What is your name?");
        String user = input.nextLine();
        sayHello(user);
        
        //calculate the root of 3X^2+7x+1.5
        double proot = posQuadFormula(1,-5,-50); 
        System.out.println("The positive root is "+proot);
        double[] roots = quadFormula(1,-5,-50);
        System.out.println("The roots are "+roots[0]+roots[1]);
    }
}
