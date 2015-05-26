/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bug;

/**
 *
 * @author Jason
 */
public class main {
    public static void main(String[] args){
        Bug testBug = new Bug(10);  // Construct Bug with position of 10
        System.out.println(testBug.getPosition());  // Display Position
        System.out.println("Expected: 10");     // Expected value
        testBug.move();                     // Move Bug to right
        System.out.println(testBug.getPosition());  // Display Position
        System.out.println("Expected: 11");     // Expected value
        testBug.turn();             // Turn bug to left
        testBug.move();             // Move bug
        System.out.println(testBug.getPosition());  // Display Positon
        System.out.println("Expected: 10");     // Display Expected
    }
}
