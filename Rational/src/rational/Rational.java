/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rational;

/**
 *
 * @author Jason
 */
public class Rational {
    // Constructors
    Rational(int a, int b){     // Two Parameters
        A = a;
        B = b;
    }
    Rational(int a){    // One parameter
        A = a;
        B = 1;
    }
    // Instance Variables
    private int A;  // Numerator
    private int B;  // Denominator
    // Method to set rational number with two parameters
    public void setRational(int a, int b){  // Two parameter
        A = a;
        B = b;
    }
    // Method to set rational number with one parameter
    public void setRational(int a){         // One Parameters
        A = a;
        B = 1;
    }
    // Method to get numberator of rational number
    public int getNum(){
        int holder = 0; // Holder for new divisor
                for(int i = 1; i<=B;i++){       // While i is less then denominator B do
                    if(A%i == 0 && B%i == 0){   // If A and B are divisible by i
                        holder = i;             // Holder = new divisor i
                    }
                }
        A/=holder;      // Put Numerator in lowest form
        B/=holder;      // Put Denominator in lowest form
        return A;   // Return numerator
    }
    // Method to get denominator of rational number
    public int getDen(){
        int holder = 0; // Holder for new divisor
                for(int i = 1; i<=B;i++){       // While i is less then denominator B do
                    if(A%i == 0 && B%i == 0){   // If A and B are divisible by i
                        holder = i;             // Holder = new divisor i
                    }
                }
        A/=holder;      // Put Numerator in lowest form
        B/=holder;      // Put Denominator in lowest form
        return B;   // Return Denominator
    }
    // Method to add to Rational numbers
    public void add(int c, int d){
        
        A*=d;       // Cross multiply num A with den d
        c*=B;       // Cross multiply num c with den B
        A+=c;       // Add num A and num C
        B*=d;       // Get new den B
        int holder = 0; // Holder for new divisor
                for(int i = 1; i<=B;i++){       // While i is less then denominator B do
                    if(A%i == 0 && B%i == 0){   // If A and B are divisible by i
                        holder = i;             // Holder = new divisor i
                    }
                }
        A/=holder;      // Put Numerator in lowest form
        B/=holder;      // Put Denominator in lowest form
        System.out.println(A +"/" + B);      // Print Rational number to screen
    }
}
