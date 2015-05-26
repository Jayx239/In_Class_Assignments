/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadrootdouble;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class QuadRootDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a = 0;   // A value
        double b = 0;   // B value
        double c = 0;   // C value
        double QuadPos = 0; // Quad Positive value
        double QuadNeg = 0; // Quad negative value
        
        System.out.print("Enter the a value: ");    // Prompt to enter a value
        a = input.nextDouble();                     // Scan in a value
        System.out.print("Enter the b value: ");    // Prompt to enter b value
        b = input.nextDouble();                     // Scan in b value
        System.out.print("Enter the c value: ");    // Prompt to enter c value
        c = input.nextDouble();                     // Scan c value
        if(((b*b)-4*a*c) < 0){
            double real;                    // Real value holder
            double imag;                // imaginary value holder
            real = -b/2;                // set real value
            imag = Math.sqrt(Math.abs(b*b-4*a*c));  // set imaginary number
            if(imag == 0){      // if imaginary number is 0
                System.out.printf("The roots are %.3f",real);   // values are the same, print the same number
            }
            else{
                System.out.printf("The roots are: %.3f + %.3fi and %.3f - %.3fi", real,imag,real,imag); // print both values
            }
        }
        else{
            QuadPos = (-b + Math.sqrt((b*b)-4*a*c))/(2*a);  // Set positive quad values
            QuadNeg = (-b - Math.sqrt((b*b)-4*a*c))/(2*a);  // Set negative quad value
            if (QuadPos == QuadNeg){
                System.out.printf("The roots are: %.3f",QuadPos);   // If values are the same print one value
            }
            else{
            System.out.printf("The roots are: %.3f and %.3f",QuadPos,QuadNeg);  // Print both values
            }
        }
        
    }
    
}
//7.569
//4.35
//.625