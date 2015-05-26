/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mixedcase;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class MixedCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String userInput;   // String to hold input
        boolean containsUpper = false;  // Boolean to hold true if string contains upper case letter
        boolean containsLower = false;  // Boolean to hold true if string contains lower case letter
        Scanner input = new Scanner(System.in);     // Scanner object
        System.out.print("Enter a string: ");   // prompt for input
        userInput = input.nextLine();           // Scan next line for input
        for(int i = 0; i < userInput.length()-1; i++){  // Scan each char
            if(userInput.charAt(i) == userInput.toUpperCase().charAt(i)){   // If string contains both upper and lower case letters
                containsUpper = true;   // Set Contains upper to true
            }
            else{
                containsLower=true;     // Otherwise set lowercase to true
            }
        }// If contains both upper and lowercase
        if(containsUpper == true && containsLower == true){ 
            System.out.println("The String has both lower and upper case characters."); // Let user know string contains both upper and lower case
        }
        //otherwise
        else{
            System.out.println("The String does not have both upper and lower case characters");    // Let user know string does not conatin bot upper and lower case
        }
    }   
    
}
