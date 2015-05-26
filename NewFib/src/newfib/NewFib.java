/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newfib;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class NewFib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create new scanner object
        System.out.print("Enter a value: ");    // prompt for input
        int n = input.nextInt();    // Scan user input
        int fibNumber = 1;  // create fib number holder
        int [] fibArray = {1,1,1,1,1,1,1,1,1,1};    // create intitial array
        if(n<=10){
            fibNumber = 1;  // if value is less then ten the number is 1
        }
        else{
            int counter = n-9;  // Set counter equal to input - 9
            for(int i = 0;i<counter;i++){       
                int newNumber = fibArray[6]+ fibArray[0];   // Calculate newFib number
                for(int j=1;j<10;j++){
                    fibArray[j-1] = fibArray[j];    // Shift array values
                }
            fibArray[9] = newNumber;    // append new fib number
        }
            fibNumber = fibArray[9];    // Grab final fib number
        }
        
        System.out.print("Your Fibonacci number is: ");
        System.out.println(fibNumber);  // Print fib number
        
    }
    
}
