/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gregcal;
import java.util.*;
import java.lang.Object;
/**
 *
 * @author Jason
 */
public class GregCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year = 1985;    // set year
        int month = 1;  // set month
        int day = 23;   // set day
        
        GregorianCalendar myBDay = new GregorianCalendar(year,month,day);   // Construct myBDay
        
        // My Birthday
        System.out.print("I was born on ");     // Print Text
        System.out.print(myBDay.get(Calendar.MONTH)+ "/");  // Print Month
        System.out.print(myBDay.get(Calendar.DAY_OF_MONTH)+"/");    // Print day
        System.out.println(myBDay.get(Calendar.YEAR));  // Print Year
        
        // One million seconds old
        myBDay.add(Calendar.SECOND,1000000000); // Add 1 million seconds to my birthdate
        System.out.print("I will be one million seconds old on ");     // Print Text
        System.out.print(myBDay.get(Calendar.MONTH)+ "/");  // Print Month
        System.out.print(myBDay.get(Calendar.DAY_OF_MONTH)+"/");    // Print day
        System.out.println(myBDay.get(Calendar.YEAR));  // Print Year
        
    }
    
    
}
