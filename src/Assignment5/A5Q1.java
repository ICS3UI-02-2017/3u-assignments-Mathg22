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

        //   if(origword.contains("e")||origword.contains("a")||origword.contains("i")||
        //        origword.contains("o")||origword.contains("u"))
        
            int length = origword.length();
            //use a for loop to go through the characters

for (int i = 0; i < length; i++) {
                //look at the character at position , is it a vowel?
                //   int index = origword.indexOf("b"||"a");
   // String vowel = aeiou ;
     String start = origword.substring(0, i);                    

String end = origword.substring(i);
 String transword = start + "ub" + end;
                        if(origword.charAt(i) == 'a'
                        || origword.charAt(i) == 'e'
                        || origword.charAt(i) == 'i'
                        || origword.charAt(i) == 'o'
                        || origword.charAt(i) == 'u') {
            
                    //i is the position of the vowel

            if(origword.charAt(i++)=='a'
                    || origword.charAt(i) == 'e'
                        || origword.charAt(i) == 'i'
                        || origword.charAt(i) == 'o'
                        || origword.charAt(i) == 'u'){
                    int b = end.indexOf("b");
                    if(b>=0){
                        i = b;
                    }
                    int c = end.indexOf("c");
                    if(c>=0){
                        i = c;
                    }
                    int d = end.indexOf("d");
                    if(d>=0){
                        i = d;
                    }
                    int f = end.indexOf("f");
                    if(f>=0){
                        i = f;
                    }
                    int g = end.indexOf("g");
                    if(g>=0){
                        i = g;
                    }
                    int h = end.indexOf("h");
                    if(h>=0){
                        i = h;
                    }
                    int j = end.indexOf("j");
                    if(j>=0){
                        i = j;
                    }
                    int k = end.indexOf("k");
                    if(k>=0){
                        i = k;
                    }
                    int l = end.indexOf("l");
                    if(l>=0){
                        i = l;
                    }
                    int m = end.indexOf("m");
                    if(m>=0){
                        i = m;
                    }
                    int n = end.indexOf("n");
                    if(n>=0){
                        i = n;
                    }
                    int p = end.indexOf("p");
                    if(p>=0){
                        i = p;
                    }
                    int q = end.indexOf("q");
                    if(q>=0){
                        i = q;
                    }
                    int r = end.indexOf("r");
                    
                    if(r>=0){
                        i = r;
                    }
                    int s = end.indexOf("s");
                    if(s>=0){
                        i = s;
                    }
                    int t = end.indexOf("t");
                    if(t>=0){
                        i = t;
                    }
                    int v = end.indexOf("v");
                    if(v>=0){
                        i = v;
                    }
                    int w = end.indexOf("w");
                    if(w>=0){
                        i = w;
                    }
                    int x = end.indexOf("x");
                    if(x>=0){
                        i = x;
                    }
                    int y = end.indexOf("y");
                    if(y>=0){
                        i = y;
                    }
                    int z = end.indexOf("z");
                    if(z>=0){
                        i = z;
                    }

                    }
             //       String vowelstart = end.substring(i);
         //           String vowelend = end.substring(i)
                                        

                    System.out.println(origword + " in Ubbi Dubbi is " + transword);
                    


                }
                       

            }
    

        }
    }

