/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Variance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);     // create scanner object
        List<Double> inputs = new ArrayList<Double>();  // create array list for holding inputs
        double userInput;   // holder for user input
        double average = 0; // holder for average
        double variance = 0; // Holder for variance values
        do{
            System.out.print("Enter a number: ");   // prompt for input
            userInput = input.nextDouble();     // scan next double
            if(userInput<0){
                break;      // break if less then 0
            }
            inputs.add(userInput);  // add inputs to arraylist
            average = 0;    // reset average
            for(int i = 0; i < inputs.size();i++){
                average+=inputs.get(i); // add values to average
            }
            average /= inputs.size();   // Divide to find average
            variance = 0;   // Reset Variance
            for(int i = 0; i<inputs.size();i++){
            variance += Math.pow((inputs.get(i)-average),2);  // calculate variance
            }
            double varianceAverage = variance/inputs.size();    // calculate average variance
            System.out.println("The variance is: " + varianceAverage); // display variance
        }while(userInput > 0);  // Check if user input > 0
    }
    
}
