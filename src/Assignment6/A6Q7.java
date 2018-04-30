/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author Mathg8825
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[1000];
            boolean[] numbers= new boolean[1000];
            for(int i = 0; i<1000; i++){
                numbers[i] = true;
            }
            numbers[0]= false;
            numbers[1]=false;
         for( int i = 0; i<999; i++){
             n[i] = i ;
        }
        
       int p = 0;
       for( int i=3; i<999; i++){
          int number = n[(i+1)];
           if(number % 2 ==0 ){
               numbers[i] = false; 
           }
           }
           for( int i=4; i<999; i++){
          int number = n[(i+1)];
           if(number % 3 ==0 ){
               numbers[i] = false; 
           
           }
           }
           for( int i=6; i<999; i++){
          int number = n[(i+1)];
           if(number % 5 ==0 ){
               numbers[i] = false; 
           
           }
           }
           
           for( int i=8; i<999; i++){
               
          int number = n[(i+1)];
           if(number % 7 ==0 ){
               numbers[i] = false; 
           
           }
           
           }
           System.out.println("The prime numbers are ");
           for(int i = 2; i<1000; i++){
               if(numbers[i]= true){
                   System.out.println(""+n[i]);
               }
           }
    }
}

