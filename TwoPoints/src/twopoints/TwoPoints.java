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
public class TwoPoints {
    // Constructor
    TwoPoints(double x1, double y1, double x2, double y2){
        // Set instance variables to input
        X1 = x1;
        Y1 = y1;
        X2=x2;
        Y2=y2;
    }
    // Instance variables
    private double X1;
    private double Y1;
    private double X2;
    private double Y2;
    
     // Method to determine slope 
    double slope(){
        double slope = 0;
        if(X1==X2){
            slope = Double.POSITIVE_INFINITY;   // Print infinity if x1 = x2
        }
        else{
        slope = (Y2-Y1)/(X2-X1);     // Calculate slope
        }
        return slope;                       // Return slope
    }
    // Method to find the y value on the line at a given x value
    double interpolate(double x){
        double y = Y1-(this.slope()*(X1-x));    // Calculate y value
        return y;                           // Return y value
    }
    
}
