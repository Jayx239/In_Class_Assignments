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
public class RationalTest {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rational testRational = new Rational(15,5);     // Create new Rational object
        Rational testRational1 = new Rational(10);      // Create new Rational object
        System.out.print("Numerator: ");
        System.out.println(testRational.getNum());      // Get numerator of testRational
        System.out.println("Expected: 3");        // Expected value
        System.out.print("Denominator: ");
        System.out.println(testRational.getDen());      // Get denominator of testRational
        System.out.println("Expected: 1");        // Expected value
        
        System.out.print("Numerator: ");
        System.out.println(testRational1.getNum());     // get numerator of testRational 1
        System.out.println("Expected: 10");        // Expected value
        System.out.print("Denominator: ");
        System.out.println(testRational1.getDen());     // get denominator of testRational 1
        System.out.println("Expected: 1");          // Expected value
        
        testRational.setRational(20);               // set rational to 20
        System.out.print("Numerator: ");            //Print
        System.out.println(testRational.getNum());      // get numerator of testRational
        System.out.println("Expected: 20");        // Expected value
        System.out.print("Denominator: ");          // Print
        System.out.println(testRational.getDen());      // get denominator of testRational
        System.out.println("Expected: 1");         // Expected value
        
        testRational.setRational(25,26);            // set Rational to 25/26
        System.out.print("Add 25/26 and 14/13: ");  // Print
        testRational.add(14, 13);                   // add 14/13 to testRational
        System.out.println("Expected: 53/26 ");        // Expected value
        System.out.print("Numerator: ");                // Print
        System.out.println(testRational.getNum());      // get Numerator of testRational
        System.out.println("Expected: 53");        // Expected value
        System.out.print("Denominator: ");          // Print
        System.out.println(testRational.getDen());      // get Denominator of testRational
        System.out.println("Expected: 26");        // Expected value
        
        System.out.print("Add 100/50 and 10: ");   // Print
        testRational1.add(100, 50);                 // add 100/50 to testRational 1
        System.out.println("Expected: 12/1 ");        // Expected value
        System.out.print("Numerator: ");
        System.out.println(testRational1.getNum());     // Get numerator of testRational 1
        System.out.println("Expected: 12");        // Expected value
        System.out.print("Denominator: ");
        System.out.println(testRational1.getDen());     // Get denominator of testRational 1
        System.out.println("Expected: 1");        // Expected value
        
        
    }
}
