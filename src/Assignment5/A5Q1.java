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
//use the scanner to read info
        Scanner input = new Scanner(System.in);
//ask user for word to translate
        System.out.println("Enter the sentence you wish to translate into Ubbi Dubbi here:");
        //creating a string to store the word the user entered
        String origword = input.nextLine();
//turn the word into lowercase to make it easier when I'm looking for vowels 
        origword = origword.toLowerCase();
//set variable to the legth of th e word
        int length = origword.length();
        //created an empty string for me to create the translated word in
        String newword = "";
        //the "ub" I will add into the new word. I did this mainly because I felt it is easier instead of constantly adding quotations
        String ub = "ub";
        {
            /*i will be the place of the character I am adding to the new word.
             Increase i by one each time as to move through the whole word one by one
             Repeat the operation within the brackets until the end of the word.*/
            for (int i = 0; i < length; i++) {
                //Is there a vowel at position i?
                if (origword.charAt(i) != 'a'
                        && origword.charAt(i) != 'e'
                        && origword.charAt(i) != 'i'
                        && origword.charAt(i) != 'o'
                        && origword.charAt(i) != 'u') {
                    //If there is no vowel then add the character at i to new word
                    char letter = origword.charAt(i);
                    newword = newword + letter;

                }
                //Is there a vowel at position i?
                if (origword.charAt(i) == 'a'
                        || origword.charAt(i) == 'e'
                        || origword.charAt(i) == 'i'
                        || origword.charAt(i) == 'o'
                        || origword.charAt(i) == 'u') {
                    //If there is a vowel then add ub and the character to new word
                    char letter = origword.charAt(i);
                    newword = newword + ub + letter;
                    /*if the next character is still within the length of the word and there is a vowel there then increase 
                     i by one and add that vowel to the new word and repeat this if there are more vowels 
                     right after each other.*/
                    while (i + 1 < length && (origword.charAt(i + 1) == 'a'
                            || origword.charAt(i + 1) == 'e'
                            || origword.charAt(i + 1) == 'i'
                            || origword.charAt(i + 1) == 'o'
                            || origword.charAt(i + 1) == 'u')) {

                        i++;
                        char vowel = origword.charAt(i);
                        newword = newword + vowel;

                    }
                }



            }
            //tell the user the original word and the new translated word
            System.out.println(origword + " in Ubbi Dubbi is " + newword);

        }
    }
}