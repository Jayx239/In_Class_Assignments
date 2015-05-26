/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrtocent;
import java.util.Scanner;
/**
 *
 * @author jpg77
 */
public class FahrToCent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fahr = 0;   // Create fahr int
        int cent = 0;   // Create cent int
        Scanner input = new Scanner(System.in); // Create scanner object
        fahr = input.nextInt(); // Scan next int into fahr
        int remain = ((fahr-32)*5%9);   // Calculate Remainder
        cent = (((fahr-32))+ remain)/9;     // Calculate centigrade using remainder to avoid division issue
        System.out.println("Temperature in Centigrades: " + cent);  // Print
        
    }
}
