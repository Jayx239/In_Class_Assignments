/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author jpg77
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create Scanner object
        String word;                            // Create String word
        System.out.print("Enter a 4 character string: ");   // Print 
        word = input.next();                            // Scan input into word
        StringBuffer wordReversed = new StringBuffer(word.length());    // Create new String buffer object
        for(int i=word.length()-1; i >=0; i-- ){
            wordReversed.append(word.charAt(i));    // Append End of word to beginning of wordReversed
        }
        System.out.println("The new word is: " + wordReversed); // Print Reversed Word
        
    }
}
