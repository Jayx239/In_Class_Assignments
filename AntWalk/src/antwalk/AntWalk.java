/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antwalk;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *
 * @author jpg77
 */
public class AntWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Create Scanner object
        int length = 0; // Length holder
        int width = 0;  // Width holder
        int height = 0; // height holder
        double distance1 = 0;   // Create Distance 1
        double distance2 = 0;   // Create Distance 2
        double distance3 = 0;   // Create Distance 3
        double ShortDist = 0;   // Shortest Distance
        System.out.print("Enter length: "); // Print
        length = input.nextInt();           // Set Length to input
        System.out.print("Enter width: ");  // Print
        width = input.nextInt();            // Set Width to input
        System.out.print("Enter height: "); // Print
        height = input.nextInt();           // Set height to input
        distance1 = length + Math.sqrt(width*width+height*height);  // Set Distance 1 to length plus disecting line of width height square
        distance2 = width + Math.sqrt(length*length+height*height); // Set Distance 1 to width plus disecting line of length height square
        distance3 = height + Math.sqrt(length*length+width*width);  // Set Distance 1 to heigth plus disecting line of width length square
        // Calculate shortest distance
        if(distance1 <= distance2 && distance1 <= distance3){
        ShortDist = distance1;                                  // Set Shortest distance to distance 1
    }
        else if(distance2 <= distance1 && distance2 <= distance3){
        ShortDist = distance2;                                  // Set shortest Distance to distance 2
    }
        else{
            ShortDist = distance3;                              // Set shortest distance to distance 3
        }
        System.out.println("The Shortest Distance is " + ShortDist);    // Print shortest distance
    }
}
