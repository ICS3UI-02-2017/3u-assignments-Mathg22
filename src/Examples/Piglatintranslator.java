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
public class Piglatintranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //repeat the translator
        while(true){
            //get the word to translate
            System.out.println("Enter a word to translate: ");
            String origWord = input.nextLine();
            //sanitize the input
            origWord= origWord.toLowerCase();
            //do we start wit a vowel
            if(origWord.startsWith("e")||origWord.startsWith("a")||origWord.startsWith("i")||origWord.startsWith("o")||origWord.startsWith("u"))
            {
            //stick ay on the end
                String transWord = origWord + "ay";
                System.out.println(origWord+" in Pig latin is "+transWord);                
            }else{
                //walk down the word looking for the vowel
                int length = origWord.length();
                //use a for loop to go through the characters
                for(int i = 0; i< length; i++){
                    //look at the character at position , is it a vowel?
                    if(origWord.charAt(i) == 'a'||
                    origWord.charAt(i) == 'e'||
                    origWord.charAt(i) == 'i'||
                    origWord.charAt(i) == 'o'||
                    origWord.charAt(i) == 'u'){
                        //i is the position of the vowel
                        String start = origWord.substring(0,i);
                        String end = origWord.substring(i);
                        //compute translated word
                  String transWord = end+start+ "ay";
                        System.out.println(origWord+" in Pig latin is "+transWord);
                        //done looking so stop the for loop
                        break;
                    }
           /* code to help me for asignment five by Mr. Lamont. char c = origword.charAt(1);
                    if(origword.charAt(1) == 'a')
                    int index = origword.indexOf(")*/
                }
                
            
        }
    }
}
}