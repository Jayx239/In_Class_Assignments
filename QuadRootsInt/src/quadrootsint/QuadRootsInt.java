/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadrootsint;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class QuadRootsInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);     // Create scanner object
        int a = 0;      // Integer to hold a value
        int b = 0;      // Integer to hold b value
        int c = 0;     // Integer to hold c value
        int QuadPos = 0;     // Double to hold positive quad root
        int QuadNeg = 0;     // Double to hold negative quad root
        
        System.out.print("Enter the a value: ");    // ask for a value
        a = input.nextInt();    // Read in a value
        System.out.print("Enter the b value: ");    // ask for b value
        b = input.nextInt();    // Read in b value
        System.out.print("Enter the c value: ");    // ask for c value
        c = input.nextInt();    // Read in c value
        if(((b*b)-4*a*c) < 0){
            double real;    // Real value holder
            double imag;    // imaginary number holder
            real = -b/2;    // real number is equal to b/2
            imag = Math.sqrt(Math.abs(b*b-4*a*c));  // Calculate imag number
            System.out.printf("The roots are: %.3f + %.3fi and %.3f - %.3fi", real,imag,real,imag); // Print both numbers
        }
        else{
            QuadPos = (int)(-b + Math.sqrt((b*b)-4*a*c))/(2*a);         // Calculate positive quad root
            QuadNeg = (int)(-b - Math.sqrt((b*b)-4*a*c))/(2*a);         // Calculate negative quad root
            System.out.printf("The roots are: %.3f and %.3f",QuadPos,QuadNeg);      // Print roots
        }
        /* For the values of a=10000 b=75000 and c=35000 the return value is not correct
        because the values are too large to be held in the integer data type so the result is wrong
        **/
    }
    
}
