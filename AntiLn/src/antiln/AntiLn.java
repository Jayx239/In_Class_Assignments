/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package antiln;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class AntiLn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create Scanner object
        double userInput = 0;           // create double to hold user input
        System.out.print("Enter a number: ");   // Prompt to input value
        userInput = input.nextDouble();     // Scan next double
        double output = 0;      // Create output holder
        // While int i is less then 10
        for(int i=0;i<10;i++){
            double factorial = 1;   // Create factorial
            for(int j=i; j>0;j--){  
                factorial*=j;       // Calculate factorial
            }
            double pow = Math.pow(userInput,i);     // Calculate power value
            output+= pow/factorial;             // Calculate ouput values
        }
        System.out.println("Your answer is: " + output);    // Print exponential value
        System.out.println("Expected: " + Math.exp(userInput));     // Expected value
    }
    
}
