/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangle;

import static java.lang.Math.sqrt;

/**
 *
 * @author Jason
 */
public class Triangle {
    // Declare Triangle constructor
    Triangle(double a, double b, double c){
        if(a!=0&&b!=0&&c!=0){
            // initialize instance variables
            A = a;      
            B = b;      
            C = c;
        }
        else{
            System.exit(0);
        }
    }
    // Create instance variables to hold triangle variables
    private double A;
    private double B;
    private double C;
    
    // Function to get perimeter of triangle
    public double getPerimeter(){
        double perimeter = A+B+C;   // Define Perimeter
        return perimeter;       //Return Perimeter
    }
    
    // Function to get the area of the triangle
    public double getArea(){
        double perimeter = getPerimeter();          // Declare and define perimeter
        double Area = sqrt((perimeter/2)+((perimeter/2)-A)+((perimeter/2)-B)+((perimeter/2)-C));  // Calculate Area
        return Area;        // Return Area
    }
    
    // Function to determine if triangle is obtuse
    public int isObtuse(){
        int x;              // Create x variable
        if(A*A+B*B>C*C){
            x=1;            // Set x to 1 if obtuse
        }
        else{
            x=0;            // Otherwise set x to 0
        }
        return x;           // Return x
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle TestTriangle = new Triangle(4,4,5);    // Construct TesTriangle object
        System.out.println(TestTriangle.getPerimeter());    // Print perimeter of TestTriangle
        System.out.println("Expected: 13.0");           // Expected value
        System.out.println(TestTriangle.getArea());     // Print TestTriangle Area
        System.out.println("Expected: 23.60555...");    // Exptected value
        System.out.println(TestTriangle.isObtuse());    // Print obtuse check
        System.out.println("Expected: 1");              // Expected value
    }
    
}
