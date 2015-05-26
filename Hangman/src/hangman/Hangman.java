/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hangman;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String word = null;     // Create word holder
        Scanner input = new Scanner(System.in); // Create new scanner object
        System.out.print("Player one, enter a word: "); // Prompt for player one to enter a word
        word = input.nextLine();        // scan word for player one
        word = word.toLowerCase();      // make word lowercase
        // Print blank space to hide word
        for(int i = 0;i<30;i++){
            System.out.println();
        }
        int wordLength = word.length();     // Get wordlength
        char[] guess = new char[wordLength];    // Create character array to hold right guesses
        // Print blank lines to show how many characters to guess
        for(int i = 0; i<wordLength;i++){
            guess[i] = '_';
            System.out.print(guess[i] + " ");
        }        
        System.out.println();   // Print empty line
        int i = 6;              // turn counter
        char guessChar;         // holder for guess
        int guessCount = 0;     // Counter for how many guesses were right
        int correct = 0;        // correctness checker flag
        do{
            System.out.print("Player 2, guess a letter: "); // Prompt for player two to guess
            guessChar = input.next().charAt(0);     // scan in next char
            String guessString = "";            // initialize guessString for making char lowercase
            guessString += guessChar;       // add guess to string
            guessString = guessString.toLowerCase();    // Make string lowercase
            guessChar = guessString.charAt(0);      // restore guessChar as lowercase
            // Check guess to see if it is a match
            for(int j = 0; j < wordLength; j++){
                // If guesschar is a match
                if(word.charAt(j)==guessChar){
                    guess[j] = word.charAt(j);  // set a char in the array guess to guessChar 
                    correct = 1;                // Note correct guess
                    guessCount++;               // increment guess count
                }
            }
            // Print guess
            for( int j = 0; j < wordLength; j++){
                System.out.print(guess[j] + " ");
            }
            System.out.println();   // print blank line
            if (correct == 0){      // If incorrect decrement guesses left
            i--;
            
            }
            else{
                correct =0;     // if correct reset correct flag
            }
            System.out.println("You have " + i + " guess left");    // Print number of turns left
        }while(i>0 && guessCount != wordLength);        //repeat do while if there is atleast 1 turn left and the word has not been entirely guessed
    }
    
}
