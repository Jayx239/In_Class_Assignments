/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complex;

/**
 *
 * @author Jason
 */
public class Complex {
    // Constructor for complex class (takes two parameters for real and imag numbers)
    Complex(double a, double b){
        if(b==0){
            System.exit(0);    
        }              
        else{
            A = a;          // Sets Real num
            B = b;              // Sets Imag number
            complexNumber = A + " + " + B + "i";     // Sets complex number
        }
    }
    // Intstance Variables
    private double A;  // Real part of complex number
    private double B;  // Imaginary part of complex number
    private String complexNumber;   // Complex number
    private double magnitude;   // Magnitude of complex number
    // Method to set Real number
    public void setReal(double a){
        A = a;
    }
    // Method to get real number
    public double getReal(){
        return A;
    }
    // Method to set imaginary number
    public void setImag(double b){
        B = b;
    }
    // Method to get imaginary number
    public double getImag(){
        return B;
    }
    // Method to get Magnitude
    public double getMag(){
        magnitude = A+B;
        return magnitude;
    }
    // Method to print number
    public void printNum(){
        complexNumber = A + " + " + B + "i";
        System.out.println(complexNumber);
    }
    // Method to multiply two complex numbers together
    public Complex addNum(Complex temp){
        this.A += temp.A;               // Add real numbers
        this.B += temp.B;               // Add imaginary numbers
        return this;                    // Return modified complex object
    }
    public Complex multiplyNum(Complex temp){
        this.A *= temp.A;               // Multiplies Real numbers
        this.B *= temp.B;               // Multiplies imaginary numbers
        return this;                    // Returns modified complex object
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Constructs two complex objects
        Complex testA = new Complex(5,5);
        Complex testB = new Complex(10,10);
        // Print functions
        System.out.println(testA.getReal());    // Gets Real part of complex number in testA
        System.out.println("Expected: 5.0");    // Expected Value
        System.out.println(testA.getImag());    // Gets imaginary part of complex number in testA
        System.out.println("Expected: 5.0");    // Expected Value
        
        testA.setReal(10);                      // Sets Real value of testA to 10
        System.out.println(testA.getReal());    // Gets and returns Real value from testA
        System.out.println("Expected: 10.0");   // Expected value
        
        testA.setImag(10);                      // Sets imaginary number of testA to 10
        System.out.println(testA.getImag());    // Gets and returns imaginary number of testA
        System.out.println("Expected: 10.0");   // Expected value
        System.out.println(testA.getMag());     // Returns magnitude of testA
        System.out.println("Expected: 20.0");   // Expected value
        
        testA.printNum();                       // Prints testA complex number
        System.out.println("Expected: 10.0 + 10i"); // Expected
        
        testA.addNum(testB);                // Adds complex number from testB to testA
        System.out.println(testA.getImag());        // Returns testA modified imaginary value
        System.out.println("Expected: 20.0");       // Expected value
        System.out.println(testA.getReal());        // Gets modified real value from test A
        System.out.println("Expected: 20.0");       // Expected
        
        testA.multiplyNum(testB);               // Mutliplys complex number from testA to testB
        System.out.println(testA.getImag());        // Returns modified imaginary value from test A
        System.out.println("Expected: 200.0");      // Expected value
        System.out.println(testA.getReal());        // Returns real value from testA
        System.out.println("Expected: 200.0");      // Expecte value
        
    }
    
}
