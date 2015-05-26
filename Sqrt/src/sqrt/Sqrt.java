/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sqrt;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author jpg77
 */
public class Sqrt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create new scanner object
        int number = 0;     // Create int to hold input
        System.out.print("Please enter a number to take the square root of: "); // Print Request
        number = input.nextInt();       // Set number to input
        double squareRoot = 0;          // Create squareRoot to hold square root value
        if(number > 0){
            squareRoot = Math.sqrt(number);     // Set square root to square root of number
            System.out.printf("%.2f",squareRoot);       //Print square root with 2 decimals
        }
        else{
            squareRoot = Math.sqrt(Math.abs(number));   // Set squareRoot to the square root of the absolute value of number
            System.out.printf("%.2fi",squareRoot);  // Print square root with following i to show it is the square root of a negative number
        }
    }
}
