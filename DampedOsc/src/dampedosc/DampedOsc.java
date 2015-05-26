/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dampedosc;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author jpg77
 */
public class DampedOsc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create Scanner object
        double v = 0; // v(t) Value
        double V = 5; // Max Value of oscillation
        double alpha = .1;      // Alpha 
        double omega = .01; // Omega in rad/s
        double t = 0;       // Time
        System.out.print("Enter Time: ");
        t = input.nextInt();        // set t equal to next int input
        v = V * Math.exp(alpha*t) * Math.cos(omega*t);  // Calculate v(t)
        System.out.println("v(t) = " + v);  // Print v(t)
    }
}
