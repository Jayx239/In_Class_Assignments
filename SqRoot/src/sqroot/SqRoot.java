/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sqroot;
import static java.lang.Math.sqrt;

/**
 *
 * @author Jason
 */
public class SqRoot {

    SqRoot(){
        
    }
    // Method that returns the square root of the entered number
    public double sqRoot(double number){
        double root = sqrt(number); // Store Square root of number
        return root;    // Print square root
    }
    // Method that prints number entered and sqareroot of entered number
    public void printSqRoot(double number){
        System.out.println(number + " " + sqRoot(number));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 25;        // Declare and initialize number
        SqRoot test = new SqRoot(); // Create test object of type SqRoot
        System.out.println(test.sqRoot(number));    // Print sqRoot method 
        System.out.println("Expected: 5.0");    // Print Expected
        test.printSqRoot(number);   // Run printSqRoot method
        System.out.println("Expected: 25.0 5.0");    // Print Expected
        
    }
    
}
