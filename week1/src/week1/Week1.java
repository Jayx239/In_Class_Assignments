/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week1;
import java.io.Console;
/**
 *
 * @author Jason
 */
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console console = System.console();
        String n;
        System.out.println("Enter a number");
        n=console.readLine();
        System.out.println("Your number x 2 = " + n);
        // TODO code application logic here
    }
    
}
