/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dowhiletodo;

import java.util.Scanner;

/**
 *
 * @author Jason
 */
public class DoWhileToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int day = 0;    // Create day holder
        Scanner input = new Scanner(System.in); // Create Scanner object
        // run through code first
        System.out.print("Enter a day ( Sun = 0, Mon = 1,..., Sat = 6 ): ");    // Prompt to enter day
        day = input.nextInt();  // scan next int into day
        System.out.println();   // print blank line
        //Then check parameters and continue if parameters are met
        while( (day<0)||(day>6)){
            System.out.print("Enter a day ( Sun = 0, Mon = 1,..., Sat = 6 ): ");    // prompt to enter day
            day = input.nextInt();  // scan int into day
            System.out.println();   // print blank line
        }
        /* A do while loop runs through code then if certain parameters are met
        it runs through the code until the parameters are not met. Simulating this
        with a while loop means that the code within the loop must be place before
        the loop even runs and then the while loop follows with that same code inside
        of it.
        **/
    }
    
}
