/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twopoints;

/**
 *
 * @author Jason
 */
public class TwoPointTester {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        TwoPoints twopoints = new TwoPoints(0,0,5,10);      // Construct twopoints object
        System.out.print("Slope: ");                // Print 
        System.out.println(twopoints.slope());      // Print slope
        System.out.println("Expected: 2.0");        // Print Expected
        System.out.print("Intepolate x = 1: ");         // Print
        System.out.println(twopoints.interpolate(1));   // Print result of interpolate method
        System.out.println("Expected: 2.0");            // Print Expected
        
        TwoPoints twopoint = new TwoPoints(1,2,1,5);
        System.out.println("Slope: ");          //Print
        System.out.println(twopoint.slope());      // Print slope
        System.out.println("Expected: Infinity");        // Print Expected
    }
}
