/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author Mathg8825
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the sentence you wish to translate into Ubbi Dubbi here:");
        String origword = input.nextLine();

        origword = origword.toLowerCase();

   
            int length = origword.length();
            //use a for loop to go through the characters
String newword = "";
String ub = "ub";
         {
            
            for(int i=0; i<length; i++){
                //look at the character at position , is it a vowel?
    if(origword.charAt(i) != 'a'
                        && origword.charAt(i) != 'e'
                        && origword.charAt(i) != 'i'
                        && origword.charAt(i) != 'o'
                        && origword.charAt(i) != 'u') {
                            char letter = origword.charAt(i);
        newword = newword + letter;
        
}
                        if(origword.charAt(i) == 'a'
                        || origword.charAt(i) == 'e'
                        || origword.charAt(i) == 'i'
                        || origword.charAt(i) == 'o'
                        || origword.charAt(i) == 'u') {
                            char letter = origword.charAt(i);
        newword = newword +  ub + letter;



 while(i<length&&origword.charAt(i) == 'a'
                        || origword.charAt(i) == 'e'
                        || origword.charAt(i) == 'i'
                        || origword.charAt(i) == 'o'
                        || origword.charAt(i) == 'u'
                        
                        ){
            
     i++;
              char vowel = origword.charAt(i);
        newword = newword + vowel;
            } 
                        }

                        
          
            }
    System.out.println(origword + " in Ubbi Dubbi is "+ newword );

        }
    }

}