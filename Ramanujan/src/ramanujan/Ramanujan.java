/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ramanujan;
import java.math.*;
import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class Ramanujan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");  // Prompt for user input
        double userInput = input.nextInt();     // Scan next line for user input
// Find values where a^3 + b^3 = c^3 + d^3
        // calculate a values
      for (int a = 1; a <= userInput; a++) {
         int aCubed = a*a*a;    // Find a^3
         if (aCubed > userInput){   // if greater then input break
             break;
         }

         // calculate b calue to be added to a value
         for (int b = a; b <= userInput; b++) {
            int bCubed = b*b*b;     // Find b^3
            if (aCubed + bCubed > userInput){   // if greater then input break
                break;
            }
            
            for (int c = a + 1; c <= userInput; c++) {
               int cCubed = c*c*c;      // Find c^3
               if (cCubed > aCubed + bCubed){   // if greater then a^3 + b^3 break
                   break;
               }
               // 
               for (int d = c; d <= userInput; d++) {
                  int dCubed = d*d*d;   // Find d^3
                  if (cCubed + dCubed > aCubed + bCubed){   // if greater then a^3 + b^3 break
                      break;
                  }
                  // Print Result if Ramanujan number if conditions are satisfied
                  if (cCubed + dCubed == aCubed + bCubed) {
                     System.out.print((aCubed+bCubed) + " = " + a + "^3 + " + b + "^3 = "  + c + "^3 + " + d + "^3");
                     System.out.println();
                  }
               }
            }
         }
      }
        
    }
    
}
