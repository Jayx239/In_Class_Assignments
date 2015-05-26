/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fortodowhile;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class ForToDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create scanner object
        int start = input.nextInt();    // Scan start value
        int end = input.nextInt();  // Scan end value
        System.out.println("--------------- Start for loop -----------");   // Indicate for loop comes next
        for( int i = start; i < end; i++ )  // Start for loop
            System.out.printf("Integer = %d, Squared = %d%n", i, i*i);  // Print values
        System.out.println("--------------- Start do while -----------");   // Seperator
        
        int i = start;  // Create counter variable
        do{
            if (start<end)  // If start<end
                System.out.printf("Integer = %d, Squared = %d%n", i, i*i);  // Print values
        i++;    // Increment counter
        }while(i<end);  // Repeat if condition is met
    }
    
}
